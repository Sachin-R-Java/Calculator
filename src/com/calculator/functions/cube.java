package com.calculator.functions;

import com.calculator.utility.dataReading;

public class cube {
	public static void cubeOfNumber() {
		int a = dataReading.getNumber();

		int cube = a * a * a;
		System.out.println("Cube of " + a + " is " + cube);
	}

}
