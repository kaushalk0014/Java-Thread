package com.learning.thread.lock;

public class ReadThread extends Thread {

	private ReadWriteCounter counter;

	public ReadThread(String name, ReadWriteCounter counter) {
		super(name);
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - Count: " + counter.getCount());
		}
	}
}
