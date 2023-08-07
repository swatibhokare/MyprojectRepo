package com.assignmentwhileloop;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum=0;
		int avg=0;
		while (num > 0) {
			int digit = num % 10;

			num = num / 10;
         sum=sum+digit;
         avg=sum/2;
	}System.out.println(avg);
}
}