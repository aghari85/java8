package com.agh.java8.runnable;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread is running");
			}
		});
		thread.run();

		/*
		 * Runnable is a interface it contains only one abstract method definition. 
		 * So, we can use lambda instead of anonymous Runnable 
		 */
		Thread thread2 = new Thread(() -> System.out.println("Thread is running by lambda"));
		thread2.run();
	}

}
