package com.learning.thread.lock;

public class ThreadLockBankTestMain {

	public static void main(String[] args) {
		ThreadLockBackAccount account = new ThreadLockBackAccount();
		
		ThreadLockBankThread t1 = new ThreadLockBankThread(account, "Thread-1");
		ThreadLockBankThread t2 = new ThreadLockBankThread(account, "Thread-2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Transaction completed");
	}
}
