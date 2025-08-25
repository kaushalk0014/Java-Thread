package com.learning.thread.synchronize;

public class SynchronizedBlockTest {
	
	
	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		
		SynchronizedThread t1 = new SynchronizedThread(counter);
		SynchronizedThread t2 = new SynchronizedThread(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("Total Count: " + counter.getTotalCount());

	}
}
