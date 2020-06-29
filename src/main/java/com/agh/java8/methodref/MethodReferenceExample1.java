package com.agh.java8.methodref;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> printMessage());
		t1.run();

		Thread t2 = new Thread(MethodReferenceExample1::printMessage);
		t2.run();
	}

	public static void printMessage() {
		System.out.println("Hello!");
	}
}
