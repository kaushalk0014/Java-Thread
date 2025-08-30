package com.learning.thread.deadlock;

public class Task2 implements Runnable{
	
	private Pen pen;
	private Paper paper;
	
	public Task2(Pen pen, Paper paper) {
		this.pen = pen;
		this.paper = paper;
	}
	
	@Override
	public void run() {
		synchronized (pen) {
			paper.writeWithPaperAndPen(pen);// Thread 2 lock paper and tries to lock pen
		}
	}

}
