package com.practice.in28mins.excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicateOccurrences {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,2,2,2,5,7,8,8);

        Map<Integer, Long> counters = numbers.stream()
                .collect(Collectors.groupingBy(p -> p,
                        Collectors.counting()));

        List<String> persons = Arrays.asList("Jack","Jone","Ams","Bob", "Agent47");


        Map<Character, Long> personCounting = persons.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println(personCounting);
        System.out.println(counters);

    }
}
