package com.assignment.switchcase;

import java.util.Scanner;

public class Switchcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		System.out.println("1. Addition\n2.Subtraction\n3.Division\n4.Multiplication");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition= "+(num1 + num2));
			break;
		case 2:
			System.out.println("Subtraction= "+(num1 - num2));
			break;
		case 3:
			System.out.println("Division= "+(num1 / num2));
			break;
		case 4:
			System.out.println("multiplication= "+(num1 * num2));
			break;
		}
	}

}
