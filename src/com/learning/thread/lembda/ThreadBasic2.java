package com.learning.thread.lembda;

public class ThreadBasic2 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread name is : "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadBasic thread = new ThreadBasic();
		thread.start();
	}
}
