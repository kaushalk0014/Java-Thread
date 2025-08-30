package com.learning.thread.communication;

public class ProduceData implements Runnable {

	private SharedResource data;

	public ProduceData(SharedResource data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			data.produce(i);
		}
	}

}
