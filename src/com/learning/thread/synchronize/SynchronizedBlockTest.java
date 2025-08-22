package com.learning.thread.synchronize;

public class SynchronizedBlockTest extends Thread {
	
	SynchronizedBlockTest(String name){
		super(name);
	}
	
	
	static Counter counter = new Counter();
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {

		
		SynchronizedBlockTest t1 = new SynchronizedBlockTest("Thread-1");
		SynchronizedBlockTest t2 = new SynchronizedBlockTest("Thread-2");
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Final count: " + counter.getCount());

	}
}
