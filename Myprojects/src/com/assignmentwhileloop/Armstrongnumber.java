package com.assignmentwhileloop;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int digit=num%10;
			int cube=digit*digit*digit;
			sum=digit+cube;
			num=num/10;
		}
		num=temp;
		System.out.println(sum+""+num);
		
		if(sum==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not armstrong");
			
		}
	}

}
