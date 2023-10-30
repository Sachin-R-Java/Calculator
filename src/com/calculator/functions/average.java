package com.calculator.functions;

import com.calculator.utility.*;

public class average {

	public static void averageOfNumbers() {
		int totalnumbers = dataReading.getTotalNumbers();
		int sum = 0;
		System.out.println("Please enter " + totalnumbers + " numbers one by one");
		for (int i = 1; i <= totalnumbers; i++) {
			int add = scanner.scan.nextInt();
			sum = sum + add;
		}
		int avg = sum / totalnumbers;
		System.out.println("Average of " + totalnumbers + " numbers is " + avg);
	}
}
