package com.practice.in28mins.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseStreams {

    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

    public static void main(String[] args) {
        ExerciseStreams excerciseStreams = new ExerciseStreams();

        System.out.println("Print Odd Numbers");
        System.out.println("*****************");
        ExerciseStreams.printOddNumbers(excerciseStreams.numbers);

        System.out.println("Print Cubes of Odd Numbers");
        System.out.println("**************************");
        excerciseStreams.printCubesOddNumbers();

        System.out.println("Print Sum Cubes of Odd Numbers");
        System.out.println("**************************");
        excerciseStreams.printSumCubesOddNumbers();

        System.out.println("Create List of even Numbers");
        System.out.println("*****************");
        excerciseStreams.createListOfEvenNumbers();

        System.out.println("Print Courses");
        System.out.println("*************");
        excerciseStreams.printCoursesIndividually();

        System.out.println("Print Courses contains Spring");
        System.out.println("*****************************");
        excerciseStreams.printCoursesContainsSpring();

        System.out.println("Print Courses length at lease four");
        System.out.println("**********************************");
        excerciseStreams.printCoursesLengthAtleaseFour();

        System.out.println("Create List of all course title length");
        System.out.println("*****************");
        excerciseStreams.createListOfCourseLenth();

        excerciseStreams.findFactorial(5);
        
    }

    private void findFactorial(int number) {
        List<Integer> listOfNumbers = new ArrayList<>();
        int i=1;
        while(i<=5){
            listOfNumbers.add(i++);
        }

        int factorial = listOfNumbers.stream()
                .reduce(1, (x,y) -> x*y);

        System.out.println("Factorial of "+number+" is "+factorial);

    }


    private static void printOddNumbers(List<Integer> numbers){
        numbers.stream() // getting sequential elements
                .filter(n -> n%2 == 1) // filtering using Lambda
                .forEach(System.out::println); // method reference
    }

    private void printCoursesIndividually(){
        courses.forEach(System.out::println);
    }

    private void createListOfCourseLenth() {
        List<Integer> listOfLenth = courses.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());
        System.out.println("List of all course title length: " + listOfLenth);
    }

    private void createListOfEvenNumbers() {
        List<Integer> listOfEvenNumbers =  numbers.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
        System.out.println("List of even Numbers :" +listOfEvenNumbers);
    }

    private void printSumCubesOddNumbers() {
        int sumOfCubesOfOdds = numbers.stream()
                .filter(n -> n%2 ==1)
                .map(n -> n*n*n)
                .reduce(0,(x,y) -> (x+y));
        System.out.println("Print Sum Cubes of Odd Numbers : " +sumOfCubesOfOdds);
    }

    private void printCubesOddNumbers() {
        numbers.stream()
                .filter(n -> n%2 ==1)
                .map(n -> n*n*n)
                .forEach(System.out::println);
    }

    private void printCoursesLengthAtleaseFour() {
        courses.stream()
                .filter(s -> s.length()>=4)
                .forEach(System.out::println);
    }

    private void printCoursesContainsSpring() {
        courses.stream()
                .filter(s -> s.contains("Spring"))
                .forEach(System.out::println);
    }
}
