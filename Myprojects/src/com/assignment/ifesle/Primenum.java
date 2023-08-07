package com.assignment.ifesle;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,d;
		System.out.println("Enter number");
		n=sc.nextInt();
		while(n>0)
		{
			d=n%10;
			if(d==2 || d==5 ||d==7) 
				System.out.println(d);
			n=n/10;
		}

	}

}
