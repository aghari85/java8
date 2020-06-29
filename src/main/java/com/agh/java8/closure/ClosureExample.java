package com.agh.java8.closure;

import java.util.function.Consumer;

public class ClosureExample {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;

		/**
		 * i is pass by reference
		 * But j is pass by value. So, it is a final.
		 * When lambda using final value then it is the concept of closure
		 */
		process(i, p -> System.out.println(i * j));
	}

	private static void process(int i, Consumer<Integer> consumer) {
		consumer.accept(i);
	}
}
