package com.agh.java8.thisref;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);

		// Case 3
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ThisReferenceExample";
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

		// Case 1
		thisReferenceExample.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i);
				System.out.println(this.toString());// this = instance of anonymous class (Process)
			}
		});

		// Case 2
		thisReferenceExample.doProcess(10, i -> {
			System.out.println(i);
			/**
			 * System.out.println(this.toString()); this = current instance. But, we
			 * cannot use this inside static method. fundamentally wrong.
			 * 
			 */
		});
	}
}

interface Process {
	void process(int i);
}
