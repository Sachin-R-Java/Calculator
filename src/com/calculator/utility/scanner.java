package com.calculator.utility;

import java.util.Scanner;

public class scanner {
	public static int choice;

	public static Scanner scan = new Scanner(System.in);

	public static void choiceSelection() {
		choice = scan.nextInt();
		if (choice == 1)
			System.out.println("Great!, You have choosen 'Addition of two numbers'");
		else if (choice == 2)
			System.out.println("Great!, You have choosen 'Substraction of two numbers'");
		else if (choice == 3)
			System.out.println("Great!, You have choosen 'Multiplication of two numbers'");
		else if (choice == 4)
			System.out.println("Great!, You have choosen 'Division of two numbers'");
		else if (choice == 5)
			System.out.println("Great!, You have choosen 'Modulus of two numbers'");
		else if (choice == 6)
			System.out.println("Great!, You have choosen 'Square of number'");
		else if (choice == 7)
			System.out.println("Great!, You have choosen 'Cube of number'");
		else if (choice == 8)
			System.out.println("Great!, You have choosen 'Average of numbers'");
		else if (choice == 9)
			System.out.println("Great!, You have choosen 'Factors of number'");
		else if (choice == 10)
			System.out.println("Great!, You have choosen 'Find out even or odd number'");
		else if (choice > 10)
			System.out.println("Ohh!, You have made wrong choice");
		else if (choice <= 0)
			System.out.println("Ohh!, You have made wrong choice");

	}

}
