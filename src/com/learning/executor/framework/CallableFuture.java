package com.learning.executor.framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture implements Callable<Integer> {
	
	@Override
	public Integer call() throws Exception {
		System.out.println("call method");
		return 2+3;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableFuture callableFuture = new CallableFuture();
		
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		
		Future<Integer> future = executorService.submit(callableFuture);
		
		Thread.sleep(100);
		if(future.isDone()) {
			System.out.println("Sum is : "+future.get());
		}
		
		executorService.shutdown();
		
		System.out.println("Is Shutdown : "+executorService.isShutdown());
		System.out.println("Is Terminated : "+executorService.isTerminated());
	}
}
