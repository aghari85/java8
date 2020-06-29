package com.agh.java8.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitOneExcerciseJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sourav", "Ganguly", 41), new Person("Dhoni", "MS", 37),
				new Person("Virat", "Kholi", 31));

		// 1 Sort list by lastName
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// 2 Print all elements
		System.out.println("Print all elements");

		printAll(people);

		// 3 Print all elements lastName starts with G
		printFirstNameStartsWithC(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getFirstName());
		}
	}

	private static void printFirstNameStartsWithC(List<Person> people, Condition c) {
		for (Person person : people) {
			if (c.test(person)) {
				System.out.println(person.getFirstName());
			}
		}

	}
}

interface Condition {
	boolean test(Person p);
}
