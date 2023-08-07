package com.assignment;

import java.util.Scanner;

public class Ternaryevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = sc.nextInt();
	

		//ternary operator to check number
		String result = number%2==0 ? "Even" : "Odd";

		System.out.println(number +" is "+ result);	

	}

}
