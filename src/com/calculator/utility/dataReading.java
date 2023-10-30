package com.calculator.utility;

public class dataReading {

	static scanner sc = new scanner();

	public static int getFirstNumber() {
		System.out.println("Enter First Number");
		int firstNumber = scanner.scan.nextInt();
		return firstNumber;
	}

	public static int getSecondNumber() {
		System.out.println("Enter Second Number");
		int secondNumber = scanner.scan.nextInt();
		return secondNumber;
	}

	public static int getNumber() {
		System.out.println("Enter a Number");
		int number = scanner.scan.nextInt();
		return number;
	}

	static int totalNumber;

	public static int getTotalNumbers() {
		System.out.println("Please enter total numbers that you want take the average of");
		int totalNumber = scanner.scan.nextInt();
		return totalNumber;
	}
}
