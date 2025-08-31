package com.learning.executor.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FindFactorialUsingExecutor {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		ExecutorService executorService = Executors.newFixedThreadPool(8);

		for (int i = 1; i <= 10; i++) {
			final int num = i;
			executorService.submit(() -> {
				int factors = findFactorial(num);
				System.out.println("Factor of " + num + " = " + factors);
			});
		}

		executorService.shutdown();
		//executorService.shutdownNow();
		try {
			
			//executorService.awaitTermination(1, TimeUnit.SECONDS);
		
			while(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
				System.out.println("wait..");
			}
		
		}catch(Exception e) {
			throw new RuntimeException();
		}
		System.out.println("Total time : " + (System.currentTimeMillis() - startTime));
	}

	public static int findFactorial(int number) {
		int result = 1;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//			Thread.currentThread().interrupt();
//		}
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return result;
	}
}
