package com.learning.thread.communication;

public class ConsumData implements Runnable {

	private SharedResource data;

	public ConsumData(SharedResource data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			data.consumer();
		}
	}

}
