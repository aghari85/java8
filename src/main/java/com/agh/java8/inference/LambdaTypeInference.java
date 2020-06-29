package com.agh.java8.inference;

public class LambdaTypeInference {

	public static void main(String[] args) {
		LengthLamda myLambda = (String s) -> System.out.println(s.length());
		myLambda.stringLengh("Hello! World!!");
		
		/*
		 * Compiler inference lot of things from our code
		 * thats the reason we no need to mention access specifiers and return/void type of the method in lambda
		 * same way, we can also no need to mention argument type also. 
		 */
		LengthLamda myLambda2 = (s) -> System.out.println(s.length());
		myLambda2.stringLengh("Hello! World!!!");
		
		//even no parenthesis required to argument if it is only argument to the method
		LengthLamda myLambda3= s -> System.out.println(s.length());
		myLambda3.stringLengh("Hello! World!!!!");
	}
}

interface LengthLamda {
	void stringLengh(String s);
}
