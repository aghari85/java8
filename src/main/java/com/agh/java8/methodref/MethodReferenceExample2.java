package com.agh.java8.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.agh.java8.excercise.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Sourav", "Ganguly", 41), new Person("Dhoni", "MS", 37),
				new Person("Virat", "Kholi", 31));

		// see, we can change the starts with character inline
		printFirstNameStartsWithC(people, (p) -> p.getFirstName().startsWith("S"), p -> System.out.println(p));

		// see, we can change the starts with character inline
		printFirstNameStartsWithC(people, (p) -> p.getFirstName().startsWith("D"), System.out::println);

	}

	/**
	 * Consumer is also out of the box interface available in java.util.function. we
	 * can use it to perform any action that we define in lambda. There are many
	 * interfaces are there for convenient program
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
