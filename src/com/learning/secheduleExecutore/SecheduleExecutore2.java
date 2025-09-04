package com.learning.secheduleExecutore;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SecheduleExecutore2 {

	public static void main(String[] args) {
		System.out.println("Task started");
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
		
		scheduledExecutorService.schedule(()->{
			System.out.println("Executed rum method");
		}, 5, TimeUnit.SECONDS);
		scheduledExecutorService.shutdown();
	}
}
