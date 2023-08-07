package com.assignment.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
long fact=1;
for(int i=num;i>=1;i--)
{
	fact=fact*i;// we can also write it as fact *=i;
	}
System.out.println("factorial of the number is :"+fact);
	}

}
