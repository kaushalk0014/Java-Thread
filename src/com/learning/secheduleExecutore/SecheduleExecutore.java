package com.learning.secheduleExecutore;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SecheduleExecutore {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
		
		scheduledExecutorService.execute(()->{
			System.out.println("Executed rum method");
		});
		scheduledExecutorService.shutdown();
	}
}
