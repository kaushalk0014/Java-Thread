package com.learning.thread.lembda;

public class ThreadLembdaSulution2 {

	public static void main(String[] args) {
		Runnable runnable = () ->{
			System.out.println("Current Thread Name is : "+ Thread.currentThread().getName());
		};
		
		Thread thread = new Thread(runnable, "Thread 1");
		
		thread.start();
	}
}
