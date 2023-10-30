package com.calculator.functions;

import com.calculator.utility.*;

public class addition {

	public static void aditionOfTwoNumbers() {
		int a = dataReading.getFirstNumber();
		int b = dataReading.getSecondNumber();

		int add = a + b;
		System.out.println("Addition of " + a + " and " + b + " is " + add);
	}

}
