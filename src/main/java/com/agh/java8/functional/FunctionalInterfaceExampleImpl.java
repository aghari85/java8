package com.agh.java8.functional;

public class FunctionalInterfaceExampleImpl {

	public static void main(String[] args) {

		/**
		 * FunctionalInterfaceExample has a method for add two number and return sum.
		 */
		FunctionalInterfaceExample obj = (a, b) -> (a + b);
		obj.add(10, 10);

		System.out.println(obj.add(12, 12));

	}

}
