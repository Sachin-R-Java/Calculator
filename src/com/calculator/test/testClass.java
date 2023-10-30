package com.calculator.test;

import com.calculator.functions.*;
import com.calculator.utility.*;

public class testClass {
	public static void main(String[] args) {

		applicationStart.welcomeMessage();
		scanner.choiceSelection();

		switch (scanner.choice) {

		case 1:
			addition.aditionOfTwoNumbers();
			break;
		case 2:
			substraction.substractionOfTwoNumbers();
			break;
		case 3:
			multplication.multiplictionOfTwoNumbers();
			break;
		case 4:
			division.divisionOfTwoNumbers();
			break;
		case 5:
			modulus.modulusOfTwoNumbers();
			break;
		case 6:
			square.squareOfNumber();
			break;
		case 7:
			cube.cubeOfNumber();
			break;
		case 8:
			average.averageOfNumbers();
			break;
		case 9:
			factors.factorsOfNumber();
			break;
		case 10:
			oddEven.checkOddEvenNumber();
			break;

		}

	}

}
