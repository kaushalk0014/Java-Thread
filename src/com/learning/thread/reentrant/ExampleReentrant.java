package com.learning.thread.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleReentrant {

	private final Lock lock = new ReentrantLock();

	public void methodA() {
		lock.lock();
		try {
			System.out.println("Inside Method A");
			methodB(); // Reentrant call
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	private void methodB() {
		lock.lock();
		try {
			System.out.println("Inside Method B");
		} finally {
			lock.unlock();
		}

	}
	
	public static void main(String[] args) {
		ExampleReentrant example = new ExampleReentrant();
		example.methodA();
	}
}
