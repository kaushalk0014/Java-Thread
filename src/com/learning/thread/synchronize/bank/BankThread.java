package com.learning.thread.synchronize.bank;

public class BankThread  extends Thread{
	
	private BackAccount account;
	
	public BankThread(BackAccount account, String threadName) {
		super(threadName);
		this.account = account;
		 
	}
	
	@Override
	public void run() {
		
		account.withdraw(50);
	}
	
}
