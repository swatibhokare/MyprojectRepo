package com.assignmentwhileloop;

import java.util.Scanner;

public class Sumdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int dig=num%10;
			sum=sum+dig;
			num=num/10;
		}
		System.out.println(sum);
		

	}

}
