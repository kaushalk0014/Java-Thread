package com.learning.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

	private int count = 0;

	private final ReadWriteLock lock = new ReentrantReadWriteLock();

	private final Lock readLock = lock.readLock();

	private final Lock writeLock = lock.writeLock();

	public void increment() {
		writeLock.lock();
		try {
			count++;
		} finally {
			writeLock.unlock();
		}
	}

	public int getCount() {
		readLock.lock();
		try {
			return count;
		} finally {
			readLock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ReadWriteCounter counter = new ReadWriteCounter();

		Thread writer1 = new WriteThread("Writer-1", counter);
		//Thread writer2 = new WriteThread("Writer-2", counter);

		Thread reader1 = new ReadThread("Reader-1", counter);
		Thread reader2 = new ReadThread("Reader-2", counter);

		writer1.start();
		//writer2.start();

		reader1.start();
		reader2.start();
		
		
		writer1.join();
		//writer2.join();
		reader1.join();
		reader2.join();
		
		//System.out.println("Final Count: " + counter.getCount());
		
		
	}
}
