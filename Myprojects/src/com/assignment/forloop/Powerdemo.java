package com.assignment.forloop;

import java.util.Scanner;

public class Powerdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base");
		int base=sc.nextInt();
		System.out.println("enter the Exponent");
		int expo=sc.nextInt();
		int power=1;
		for(int i=1;i<=expo;i++)
		{
		  power=power*base;	
		}
System.out.println("power is :" +power);
	}

}
