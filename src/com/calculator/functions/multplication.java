package com.calculator.functions;

import com.calculator.utility.dataReading;

public class multplication {
	public static void multiplictionOfTwoNumbers() {

		int a = dataReading.getFirstNumber();
		int b = dataReading.getSecondNumber();

		int mul = a * b;
		System.out.println("Multplication of " + a + " and " + b + " is " + mul);
	}

}
