package com.learning.executor.framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvockAllExample {

	public static void main(String[] args) throws InterruptedException {

		Callable<Integer> callable1 = () -> {

			System.out.println("Task 1");
			return 1;
		};

		Callable<Integer> callable2 = () -> {

			System.out.println("Task 2");
			return 2;
		};

		Callable<Integer> callable3 = () -> {

			System.out.println("Task 3");
			return 3;
		};
		
		List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		List<Future<Integer>> futures= executorService.invokeAll(list);
		
		executorService.shutdown();
		System.out.println("end task");
		
		
	}
}
