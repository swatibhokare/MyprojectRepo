package com.assignmentwhileloop;

import java.util.Scanner;

public class Spynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum=0;
		int mult=1;
		while (num > 0) {
			int digit = num % 10;

			num = num / 10;
         sum=sum+digit;
         mult=mult*digit;
		}
		if (sum == mult) {
			System.out.println("the number is Spy");
		} else {
			System.out.println("the number is not Spy");
		}

	}

}
