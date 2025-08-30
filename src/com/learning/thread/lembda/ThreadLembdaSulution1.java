package com.learning.thread.lembda;

public class ThreadLembdaSulution1 {
	
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread Name is : " + Thread.currentThread().getName());
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
