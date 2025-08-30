package com.learning.executor.framework;

public class BasicExampleExecutore {

	public static void main(String[] args) {
		
		long startTime =  System.currentTimeMillis();
		for(int i=1; i<=10; i++) {
			long factorial= findFactorial(i);
			System.out.println("Result of "+ i +" = "+factorial);
		}
		
		System.out.println("Total time : "+ (System.currentTimeMillis()-startTime));
		
	}
	
	public static long findFactorial(int number) {
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		long result=1;
		for(int i=1 ; i<=number; i++) {
			result = result *i;
		}
		return result;
	}
}
