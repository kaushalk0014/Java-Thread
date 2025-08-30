package com.learning.thread.communication;

public class SharedResource {

		private int data;
		private boolean hasData = false;
				
		public synchronized void produce(int value) {
			while(hasData) {
				try{
					wait();
				}catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			data = value;
			hasData = true;
			System.out.println("Produced: " + data);
			notify();
		}
		
		public synchronized int consumer() {
			while(!hasData) {
				try {
					wait();
				}catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			} 
			
			System.out.println("Consumed: " + data);
			hasData = false;
			notify();
			return data;
		}
				
				
}
