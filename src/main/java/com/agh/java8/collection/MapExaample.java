package com.agh.java8.collection;

import com.agh.java8.excercise.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExaample {

    public static void main(String[] args) {

        List<String> players = new ArrayList<>(Arrays.asList("Sachin", "Saurav"));

        System.out.println(players);
        List<String> respectedPlayers = players.stream().map(s -> modifyObject(s)).collect(Collectors.toList());
        System.out.println(respectedPlayers);

        List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Sachin","Tendulkar", 42),
                new Person("Saurav","Ganguly", 42)));
        List<String> personsName = persons.stream().map(s -> s.getFirstName()).collect(Collectors.toList());

        System.out.println(personsName);
    }

    private static String collectFirstNames(Person s) {
        return s.getFirstName();
    }

    private static String modifyObject(String s) {
        return "Mr."+s;
    }

}
