package com.learning.thread.communication;

public class TreadCommunication {

	public static void main(String[] args) {
		SharedResource  resource = new SharedResource();
		
		Thread produceThread = new Thread(new ProduceData(resource), "Produce Thread");
		Thread consumThread =  new Thread(new ConsumData(resource), "Consum Thread");

		
		produceThread.start();
		consumThread.start();
		
		try {
			produceThread.join();
			consumThread.join();
		}catch (Exception e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Thread communication is done");
	}
}
