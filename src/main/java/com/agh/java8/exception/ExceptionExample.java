package com.agh.java8.exception;

import java.util.function.BiConsumer;

public class ExceptionExample {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		int key = 2;

		perform(numbers, key, wrapperLambda((a, b) -> System.out.println(a / b)));

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsume) {
		return (a, b) -> {
			try {
				biConsume.accept(a, b);
			} catch (ArithmeticException e) {
				System.out.println("Exception Occurred: " + e.getMessage());
			}
		};
	}

	private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : numbers) {
			biConsumer.accept(i, key);
		}

	}

}
