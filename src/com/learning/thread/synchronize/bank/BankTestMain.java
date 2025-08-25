package com.learning.thread.synchronize.bank;

public class BankTestMain {

	public static void main(String[] args) {
		BackAccount account = new BackAccount();
		
		BankThread t1 = new BankThread(account, "Thread-1");
		BankThread t2 = new BankThread(account, "Thread-2");
		
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
