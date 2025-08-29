package com.learning.thread.unfair.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleOfUnfairLock {

	private final Lock lock = new ReentrantLock(true); // true for fair lock, false for unfair lock

	private void accessResource() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
			Thread.sleep(1000); // Simulate some work with the resource
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		} finally {
			System.out.println(Thread.currentThread().getName() + " has released the lock.");
			lock.unlock();
			
		}
	}
	
	public static void main(String[] args) {
		
		ExampleOfUnfairLock example = new ExampleOfUnfairLock();
		
		Runnable task = new Runnable() {
			@Override
			public void run() {
				example.accessResource();
			}
		};
		
		Thread thread1 = new Thread(task, "Thread 1");
		Thread thread2 = new Thread(task, "Thread 2");
		Thread thread3 = new Thread(task, "Thread 3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
