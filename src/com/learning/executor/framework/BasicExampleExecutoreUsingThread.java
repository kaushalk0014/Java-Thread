package com.learning.executor.framework;

public class BasicExampleExecutoreUsingThread {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		Thread[] threads= new Thread[10];
		
		for (int i = 1; i <= 10; i++) {
			final int num =i; 
			threads[num-1] = new Thread(()->{
				
				long factorial = findFactorial(num);
				System.out.println("Result of " + num + " = " + factorial);
			});
			
			threads[num-1].start();
		}

		for(int j =1; j<=10; j++) {
			try {
				threads[j-1].join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.println("Total time : " + (System.currentTimeMillis() - startTime));

	}

	public static long findFactorial(int number) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return result;
	}
}
