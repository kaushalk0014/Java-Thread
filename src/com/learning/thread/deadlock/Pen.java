package com.learning.thread.deadlock;

public class Pen {

	public synchronized void writeWithPenAndPaper(Paper paper) {
		System.out.println(Thread.currentThread().getName() + " is using pen "+this+" try to write on paper "+paper);
		paper.finishWriting();
	}

	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " finished writing with pen "+this);
		
	}

}
