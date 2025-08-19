package com.learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadClassTest extends Thread{
	
	@Override
	public void run() {//running method is the entry point for the thread
		System.out.println("run() Current Thread Name is : "+Thread.currentThread().getName());
	}//dead to the thread that is executing this method
	
	
	public static void main(String[] args) {
		
		System.out.println("main() Current Thread Name is : "+Thread.currentThread().getName());
		// Create an instance of ThreadClassTest
		ThreadClassTest thread  =  new ThreadClassTest();
		thread.start(); // Start the thread
		
		
		ThreadClassTest thread2  =  new ThreadClassTest();
		thread2.start(); // Start the thread
		
		//we can't run the same thread again it will throw IllegalThreadStateException
		//thread.start();
		
		//Thread pool executor is a framework that allows you to manage a pool of threads
		//Single Thread Pool Executor
		//Cached Thread Pool Executor
		//Scheduled Thread Pool Executor
		//Fixed Thread Pool Executor
		
		ExecutorService  executorService = Executors.newFixedThreadPool(10);
		//executorService.submit(null);
	}

}
