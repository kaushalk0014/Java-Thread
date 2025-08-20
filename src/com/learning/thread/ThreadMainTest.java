package com.learning.thread;

public class ThreadMainTest implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000); // Simulating some work with sleep
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread is running: " + i);
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadMainTest threadMainTest = new ThreadMainTest();
		Thread thread = new Thread(threadMainTest);	
		thread.start(); // Start the thread
		thread.join(); // Wait for the thread to finish
		System.out.println("Main thread is ending.");
	}
}
