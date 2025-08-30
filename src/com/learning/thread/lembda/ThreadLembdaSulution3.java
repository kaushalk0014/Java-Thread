package com.learning.thread.lembda;

public class ThreadLembdaSulution3 {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("Current Thread Name is : "+ Thread.currentThread().getName());
		},"Thread 1");
		
		thread.start();
	}
}
