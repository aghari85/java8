package com.practice.in28mins.excercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionInterfaceExercise {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

    public static void main(String[] args) {
        FunctionInterfaceExercise functionInterfaceExercise = new FunctionInterfaceExercise();

        /*
        Passing behaviour as an argument
         */
        Predicate<Integer> evenPredicate = x -> x%2==0;
        Predicate<Integer> oddPredicate = x -> x%2==1;
        functionInterfaceExercise.printNumbers(evenPredicate);
        functionInterfaceExercise.printNumbers(oddPredicate);

        Consumer<Integer> consumeCondition = x -> System.out.print(x + " ");
        functionInterfaceExercise.printNumbers(evenPredicate,consumeCondition);

    }

    private void printNumbers(Predicate<Integer> predicateCondition) {
        numbers.stream()
                .filter(predicateCondition)
                .forEach(System.out::println);
    }

    private void printNumbers(Predicate<Integer> predicateCondition, Consumer<Integer> consumeLogic) {
        numbers.stream()
                .filter(predicateCondition)
                .forEach(consumeLogic);
    }
}
