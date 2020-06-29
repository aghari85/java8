package com.agh.java8.functional;

/**
 * @FunctionalInterface annotation is an optional. But, it is recommend to add
 *                      to tell other users that this can be used as Functional
 *                      Interface.
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {

	/**
	 * if we include any method to this interface, it will show compilation error.
	 * Because, we used @FunctionalInterface
	 */
	public int add(int a, int b);

}
