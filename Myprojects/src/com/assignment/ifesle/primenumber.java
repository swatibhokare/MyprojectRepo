package com.assignment.ifesle;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
			
		}
			
		}
		if(count==0)
		{
			System.out.println("the number is prime");
		}else
		{
			System.out.println("the number is not prime");
		}
		
		
	}

}
