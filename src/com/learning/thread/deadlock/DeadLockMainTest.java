package com.learning.thread.deadlock;

public class DeadLockMainTest {

		public static void main(String[] args) {
			Paper paper = new Paper();
			Pen pen = new Pen();
			
			Thread thread1 = new Thread(new Task1(pen, paper), "Thread 1");
			Thread thread2 = new Thread(new Task2(pen, paper), "Thread 2");
			
			thread1.start();
			thread2.start();
		}
}
