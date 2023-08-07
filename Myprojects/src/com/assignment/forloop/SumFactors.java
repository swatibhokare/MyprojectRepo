package com.assignment.forloop;

import java.util.Scanner;

public class SumFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				System.out.print(i+" ");
				sum=sum+i;
		}
		System.out.println("the sum of factors is :"+sum);
	}
}
