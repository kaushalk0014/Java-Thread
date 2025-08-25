package com.learning.thread;

public class ThreadYeild extends Thread {

	ThreadYeild(String name) {
		super(name);
	}

	/*
	 * A hint to the scheduler that the current thread is willing to yield its
	 * current use of a processor. The scheduler is free to ignore this hint.
	 * 
	 * Yield is a heuristic attempt to improve relative progression between threads
	 * that would otherwise over-utilise a CPU. Its use should be combined with
	 * detailed profiling and benchmarking to ensure that it actually has the
	 * desired effect.
	 * 
	 * It is rarely appropriate to use this method. It may be useful for debugging
	 * or testing purposes, where it may help to reproduce bugs due to race
	 * conditions. It may also be useful when designing concurrency control
	 * constructs such as the ones in the java.util.concurrent.locks package.
	 */
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread is running: " + Thread.currentThread().getName());
			Thread.yield(); // Yielding the current thread
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadYeild thread1 = new ThreadYeild("Thread-1");
		ThreadYeild thread2 = new ThreadYeild("Thread-2");

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join(); // Wait for both threads to finish
		System.out.println("Main thread is finished.");
	}
}
