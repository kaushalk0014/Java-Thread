package com.learning.executor.framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableFuture implements Runnable {

	@Override
	public void run() {
		System.out.println("Running run method with out return value");

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		RunnableFuture runnableFuture = new RunnableFuture();

		Future<?> future = executorService.submit(runnableFuture);
		System.out.println(future.get());
 
		Future<String> runnableReturn = executorService.submit(()->
			System.out.println("I am Runnable Implementation")
		, "Hello");
			
		if(runnableReturn.isDone()) {
			System.out.println("\n Returning value using Runnable  : "+ runnableReturn.get());
		}
		
		executorService.shutdown();
	}
}
