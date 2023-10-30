package com.calculator.functions;

import com.calculator.utility.dataReading;

public class substraction {

	public static void substractionOfTwoNumbers() {
		int a = dataReading.getFirstNumber();
		int b = dataReading.getSecondNumber();

		int sub = a - b;
		System.out.println("Substraction of " + a + " and " + b + " is " + sub);
	}

}
