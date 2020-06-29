package com.agh.java8.collection;

import java.util.Arrays;
import java.util.List;

import com.agh.java8.excercise.Person;

public class ForeachLamdaExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Sourav", "Ganguly", 41), new Person("Dhoni", "MS", 37),
				new Person("Virat", "Kholi", 31));

		// External Iterator - we are explicitly define the iteration.
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		// External Iterator - we are explicitly define the iteration.
		for (Person person : people) {
			System.out.println(person);
		}

		// Internal Iterator - Compiler taken care of the iteration. This improve the
		// performance in parallel execution (MultiThreading)
		// using Lambda
		people.forEach(p -> System.out.println(p));

		// Internal Iterator - Compiler taken care of the iteration. This improve the
		// performance in parallel execution (MultiThreading)
		// using Lambda
		people.forEach(System.out::println);
	}
}
