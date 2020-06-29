package com.agh.java8.hello.lambda;

public class HelloLamda {

	private void hello() {
		System.out.println("Hello! from Basic Call");
	}

	public static void main(String[] args) {
		HelloLamda obj = new HelloLamda();
		obj.hello();
		
		HelloLambdaInterface lambdaInterface = new HelloLambdaImpl();
		lambdaInterface.perform();
		
		//to assign a lambda to a interface, an Interface that should contain only one method definition.
		HelloLambdaInterface lambdaInterface2 = () -> System.out.println("Hello! from lambda using interface");
		lambdaInterface2.perform();
		
		//anonymous class is different approach. we can use a class without create/assign it to the object.
		HelloLambdaInterface lambdaInterface3 = new HelloLambdaImpl() {
			public void perform() {
				System.out.println("Hello! from annoymous class");
			}
		};
		lambdaInterface3.perform();
	}

}
