package com.learning.thread;

public class ThreadPriority implements Runnable {

	private String threadPriorityName;

	ThreadPriority(String name) {
		this.threadPriorityName = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			String a = "";
			for (int j = 1; j < 100000; j++) {
				a += "a";
			}
			System.out.println(
					Thread.currentThread().getName() + "   :  Priority  " + Thread.currentThread().getPriority());
			try {
				Thread.sleep(100); // Simulating some work with sleep
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadPriority h = new ThreadPriority("High-Priority-Thread");
		ThreadPriority m = new ThreadPriority("Medim-Priority-Thread");
		ThreadPriority l = new ThreadPriority("Low-Priority-Thread");

		Thread tH = new Thread(h, h.threadPriorityName);
		Thread tM = new Thread(m, m.threadPriorityName);
		Thread tL = new Thread(l, l.threadPriorityName);

		// Setting thread priorities
		tH.setPriority(Thread.MAX_PRIORITY); // Highest priority
		tM.setPriority(Thread.NORM_PRIORITY); // Normal priority
		tL.setPriority(Thread.MIN_PRIORITY); // Lowest priority

		// starting thread
		tH.start();
		tM.start();
		tL.start();
	}
}
