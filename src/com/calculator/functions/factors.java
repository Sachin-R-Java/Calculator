package com.calculator.functions;

import com.calculator.utility.dataReading;

public class factors {
	public static void factorsOfNumber() {
		int a = dataReading.getNumber();

		System.out.println("Factors of " + a + " are");

		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				System.out.println(i);
		}

	}
}
