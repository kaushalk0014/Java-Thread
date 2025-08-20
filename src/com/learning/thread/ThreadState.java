package com.learning.thread;

public class ThreadState extends Thread {
	
	//Thread all states : 
	/*
	 * NEW
	 * RUNNABLE
	 * BLOCKED
	 * WAITING
	 * TIMED_WAITING
	 * TERMINATED
	 */
	@Override
	public void run() {
		try {
			System.out.println("RUNNING"); 
			Thread.sleep(2000); // Simulating some work with sleep
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread has finished execution.");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadState threadState = new ThreadState();
		System.out.println("Thread State : "+threadState.getState()); // NEW state
		threadState.start();
		System.out.println("Thread State after start() : "+threadState.getState()); // RUNNABLE state
		Thread.sleep(1000);
		System.out.println("Thread State after start() : "+threadState.getState()); // TIMED_WAITING state
		threadState.join(); // Wait for the thread to finish
		System.out.println("Thread State after join() : "+threadState.getState()); // TERMINATED state
	}
}
