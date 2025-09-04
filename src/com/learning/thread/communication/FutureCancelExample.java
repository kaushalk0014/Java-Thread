package com.learning.thread.communication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCancelExample {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer>  future= executorService.submit(()->{
			System.out.println("In calling callable call method");
			return 10;
		});
		
		future.cancel(false);
		System.out.println("Is Cancelled : "+future.isCancelled());
		System.out.println("Is Done : "+future.isDone());
		executorService.shutdown();
		System.out.println("Task end");
		
	}
}
