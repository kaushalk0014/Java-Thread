package com.learning.thread.synchronize;

public class Counter {
	private int count = 0;
	private final Object lock = new Object();

	public void increment() {
		synchronized (lock) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}
}
