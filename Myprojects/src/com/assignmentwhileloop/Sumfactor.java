package com.assignmentwhileloop;

import java.util.Scanner;

public class Sumfactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= number) {
			if (number % i == 0) {
				sum = sum + i;
				
			}
			i++;
		}
		System.out.println("sum of factor" + sum);
		
	}

}
