package com.learning.thread;

public class ThreadInterrupt extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Thread is starting...");
			Thread.sleep(20000);
			System.out.println("Thread is running");
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted, exiting...");
		} // Simulating some work with sleep
	}

	public static void main(String[] args) {
		ThreadInterrupt thread = new ThreadInterrupt();
		thread.start(); // Start the thread
		thread.interrupt();

		try {
			Thread.sleep(100); // Give it time to respond to interrupt
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread state name : " + thread.getState());
	}
}
