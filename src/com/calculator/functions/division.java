package com.calculator.functions;

import com.calculator.utility.dataReading;

public class division {
	public static void divisionOfTwoNumbers() {

		int a = dataReading.getFirstNumber();
		int b = dataReading.getSecondNumber();

		int div = a / b;
		System.out.println("Division of " + a + " and " + b + " is " + div);
	}

}
