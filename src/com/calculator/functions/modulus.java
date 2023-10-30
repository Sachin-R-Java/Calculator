package com.calculator.functions;

import com.calculator.utility.dataReading;

public class modulus {
	public static void modulusOfTwoNumbers() {

		int a = dataReading.getFirstNumber();
		int b = dataReading.getSecondNumber();

		int mod = a % b;
		System.out.println("Modulud of " + a + " and " + b + " is " + mod);
	}

}
