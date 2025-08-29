package com.learning.thread.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleReeentrant2 extends Thread {

	@Override
	public void run() {
		try {
			method1();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

	private final Lock lock = new ReentrantLock();

	public void method1() throws InterruptedException {
		lock.lockInterruptibly();
		try {
			Thread.sleep(1000); // Simulate some work
			System.out.println("Method 1");
			method2();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void method2() {
		lock.lock();
		try {
			System.out.println("Method 2");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		ExampleReeentrant2 thread1 = new ExampleReeentrant2();
		ExampleReeentrant2 thread2 = new ExampleReeentrant2();
		
		thread1.start();
		thread2.start();
	}
}
