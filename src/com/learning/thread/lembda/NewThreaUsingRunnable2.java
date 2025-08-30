package com.learning.thread.lembda;

public class NewThreaUsingRunnable2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Current Thread Name is : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		NewThreaUsingRunnable2 runnable = new NewThreaUsingRunnable2();

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
