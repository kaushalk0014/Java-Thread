package com.learning.thread;

public class ThreadYeild extends Thread {
	
	ThreadYeild(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
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
