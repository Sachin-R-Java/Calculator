package com.calculator.functions;

import com.calculator.utility.dataReading;

public class square {
	public static void squareOfNumber() {
		int a = dataReading.getNumber();

		int square = a * a;
		System.out.println("Square of " + a + " is " + square);
	}

}
