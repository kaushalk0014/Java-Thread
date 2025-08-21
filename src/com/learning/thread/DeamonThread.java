package com.learning.thread;

public class DeamonThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("DeamonThread");
		}
	}

	public static void main(String[] args) {
		DeamonThread deamonThread = new DeamonThread();
		/*
		 * Daemon thread are running in the background for example main thread is
		 * running background and it is waiting for completion of user thread/running
		 * thread.
		 * 
		 **/
		deamonThread.setDaemon(true); // Set the thread as a daemon thread
		// Daemon threads are used for background tasks and will not prevent the JVM
		// from exiting
		deamonThread.start(); // Start thread

		System.out.println("Main thread is ending.");
		// The daemon thread will terminate when the main thread ends
	}
}
