package com.learning.thread.lock;

public class ThreadLockBankThread  extends Thread{
	
	private ThreadLockBackAccount account;
	
	public ThreadLockBankThread(ThreadLockBackAccount account, String threadName) {
		super(threadName);
		this.account = account;
		 
	}
	
	@Override
	public void run() {
		
		account.withdraw(50);
	}
	
}
