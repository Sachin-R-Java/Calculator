package com.calculator.functions;

import com.calculator.utility.dataReading;

public class oddEven {

	public static void checkOddEvenNumber() {

		int a = dataReading.getNumber();
		if (a % 2 == 0)
			System.out.println(a + " is even number");
		else
			System.out.println(a + " is odd number");
	}

}
