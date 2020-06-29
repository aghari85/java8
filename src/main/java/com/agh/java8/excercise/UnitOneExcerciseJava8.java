package com.agh.java8.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitOneExcerciseJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sourav", "Ganguly", 41), new Person("Dhoni", "MS", 37),
				new Person("Virat", "Kholi", 31));

		// 1 Sort list by lastName
		Collections.sort(people, (a, b) -> a.getFirstName().compareTo(b.getFirstName()));

		// 2 Print all elements
		printFirstNameStartsWithC(people, (p) -> true);

		// 3 Print all elements lastName starts with G
		printFirstNameStartsWithC(people, (p) -> p.getFirstName().startsWith("A"));

		// see, we can change the starts with character inline
		printFirstNameStartsWithC(people, (p) -> p.getFirstName().startsWith("C"));

		// see, we can change the starts with character inline
		printFirstNameStartsWithC(people, (p) -> p.getFirstName().startsWith("C"), p -> System.out.println(p));

	}

	/**
	 * Predicate is out of the box interface available in java.util.function. we can
	 * use it for test condition. There are many interfaces are there for convenient
	 * program
	 * 
	 * @param people
	 * @param c
	 */
	private static void printFirstNameStartsWithC(List<Person> people, Predicate<Person> c) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if (c.test(person)) {
				System.out.println(person.getFirstName());
			}
		}

	}

	/**
	 * Consumer is also out of the box interface available in java.util.function. we can
	 * use it to perform any action that we define in lambda. There are many interfaces are there for convenient
	 * program
	 * 
	 * @param people
	 * @param c
	 */
	private static void printFirstNameStartsWithC(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}

	}
}
