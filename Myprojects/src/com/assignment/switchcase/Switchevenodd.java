package com.assignment.switchcase;

import java.util.Scanner;

public class Switchevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
	 number = sc.nextInt();
switch(number%2) 
{
case 0:System.out.println("number is even");
break;
case 1:System.out.println("number is odd");
break;
}


	}

}
