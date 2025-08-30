package com.learning.thread.deadlock;

public class Paper {

	public synchronized void writeWithPaperAndPen(Pen pen) {
		System.out.println(Thread.currentThread().getName() + " is using paper "+this+" try to write with pen "+pen);
		pen.finishWriting();
		
	}

	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName() + " finished writing on paper "+this);
	}

}
