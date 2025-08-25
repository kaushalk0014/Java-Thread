package com.learning.thread.synchronize;

public class SynchronizedThread extends Thread{
	
	private Counter counter;
	
	public SynchronizedThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}

}
