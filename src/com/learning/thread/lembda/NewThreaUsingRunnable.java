package com.learning.thread.lembda;

public class NewThreaUsingRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Current Thread Name is : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Runnable runnable = new NewThreaUsingRunnable();
		
		Thread thread = new Thread(runnable);
		
		thread.start();
	}
}
