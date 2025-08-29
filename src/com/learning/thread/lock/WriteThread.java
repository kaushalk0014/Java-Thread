package com.learning.thread.lock;

public class WriteThread extends Thread {

	private ReadWriteCounter counter;

	public WriteThread(String name, ReadWriteCounter counter) {
		super(name);
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			counter.increment();
			System.out.println(Thread.currentThread().getName() + "  Incremented Count");
		}
	}
}
