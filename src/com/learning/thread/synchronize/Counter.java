package com.learning.thread.synchronize;

public class Counter {
	private int count = 0;

	// mutually exclusive lock
	//1 Intrinsic lock or monitor lock
		/*
		 * These are built into every object in java.
		 * we don't see them but they are there.
		 * When we use synchronized keyword, we are using these automatic locks.
		 */
	//2 Explicit lock	
		/*
		 * These are more advance lock we can control myself by using 
		 * the Lock class from java.util.concurrent.locks package
		 * we explicitly say when to lock and unlock, giving us more control
		 * over the locking mechanism. 
		 */
	public synchronized void increment() {
		count++;
	}

	public int getTotalCount() {
		return count;
	}
}
