package com.assignment.switchcase;

import java.util.Scanner;

public class Switchdaynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();

		switch (number) {
		case 1:
			System.out.println("today is monday");
			break;
		case 2:
			System.out.println("today is tuesday");
			break;
		case 3:
			System.out.println("today is wednesday");
			break;
		case 4:
			System.out.println("today is thurseday");
			break;
		case 5:
			System.out.println("today is friday");
			break;
		case 6:
			System.out.println("today is saturday");
			break;
		case 7:
			System.out.println("today is sunday");
			default:
				System.out.println("does not exit");
		}
	}

}
