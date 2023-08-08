package com.java;

import java.util.Scanner;

public class IfElseSwitchStatements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1");
		int number1 = scanner.nextInt();
		System.out.println("Enter the number2");
		int number2 = scanner.nextInt();
		System.out.println("Enter your choise : ");
		System.out.println("choise 1 : add");
		System.out.println("choise 2 : sub");
		System.out.println("choise 3 : mul");
		System.out.println("choise 4 : div");
		int choise = scanner.nextInt();
		System.out.println(" you enter the number1 is :" +number1);
		System.out.println(" you enter the number2 is :" +number2);
		System.out.println(" you enter the choise is :" + choise);
		//Or
		//IfElseSwitchStatements.performOperationsUsingIfElse(10, 5, 3);
		//Or
		IfElseSwitchStatements.performOperationsUsingSwitch(20,5,3);

	}
//Or
//	public static void performOperationsUsingIfElse(int number1, int number2, int choise) {
//		if (choise == 1) {
//			System.out.println("Result : " + (number1 + number2));
//		} else if (choise == 2) {
//			System.out.println("Result : " + (number1 - number2));
//		} else if (choise == 3) {
//			System.out.println("Result : " + (number1 * number2));
//		} else if (choise == 4) {
//			System.out.println("Result : " + (number1/number2));
//		} else {
//			System.out.println(" Invalid Input");
//		}
//	}
//Or
	public static void performOperationsUsingSwitch(int number1, int number2, int choise) {
		switch (choise) {
		case 1: {
			System.out.println("Result : "+ (number1+ number2));
			break;
		}
		case 2: {
			System.out.println("Result : "+ (number1 - number2));
			break;
		}
		case 3: {
			System.out.println("Result : "+ (number1* number2));
			break;
		}
		case 4: 
			System.out.println("Result : "+ (number1/number2));
			break;
		
		default : {
			System.out.println("InValid Input");
		}
	
		}
	}
}
