package com.learning.thread;

public class CountNumber {

	private int count = 0;

	public synchronized void increment()   {
		count++;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		System.out.println(Thread.currentThread().getName() + ",    Count : " + count);
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args) throws InterruptedException {
		CountNumber counter = new CountNumber();

		Thread t1 = new Thread("Thread 1") {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					counter.increment();
				}
			}
		};

		Thread t2 = new Thread("Thread 2") {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					counter.increment();
				}
			}
		};

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Count: " + counter.getCount());
	}
}
