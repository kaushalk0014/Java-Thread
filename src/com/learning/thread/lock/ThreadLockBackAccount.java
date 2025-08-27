package com.learning.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLockBackAccount {

	private int balance = 200;

	private final Lock lock = new ReentrantLock();

	public void withdraw(int amount) {
		System.out.println("Attempting to withdraw " + amount + "   Thread Name: " + Thread.currentThread().getName());
		try {
			if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
				if (balance >= amount) {
					System.out.println("Processing for withdrawal " + Thread.currentThread().getName());
					try {
						Thread.sleep(3000);//It may take time to process the transaction for example 3 sec
						balance = balance - amount;
						System.out.println("Completed withdrowal Remaing balance : " + balance);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					} finally {
						lock.unlock();
					}

				} else {
					System.out.println("Insufficient balance for " + Thread.currentThread().getName());
				}
			} else {
				System.out.println(
						"Could not acquire lock, skipping transaction for " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("Thread was interrupted: " + Thread.currentThread().getName());
		}

	}
}
