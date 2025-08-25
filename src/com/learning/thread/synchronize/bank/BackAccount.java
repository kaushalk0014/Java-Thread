package com.learning.thread.synchronize.bank;

public class BackAccount {

		private int balance = 200;
		
		public synchronized void withdraw(int amount) {
			System.out.println("Attempting to withdraw " + amount+ "   Thread Name: " +
							Thread.currentThread().getName());
			
			if(balance >= amount) {
				System.out.println("Processing for withdrawal "+ Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance = balance - amount;
				System.out.println("Completed withdrowal Remaing balance : "+balance);
			}else {
				System.out.println("Insufficient balance for " + Thread.currentThread().getName());
			}
		}
}
