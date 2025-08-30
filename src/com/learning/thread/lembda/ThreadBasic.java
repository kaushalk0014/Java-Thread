package com.learning.thread.lembda;

public class ThreadBasic extends Thread{

	@Override
	public void run() {
		System.out.println("Thread name is : "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread thread = new ThreadBasic();
		thread.start();
	}
}
