package com.assignment.switchcase;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Menu");
	System.out.println("1.Area of circle");
	System.out.println("2.Area of Square");
	System.out.println("3.Ara of Rectangle");
	System.out.println("Exit");
	System.out.println("Enter Your option");
	int op=sc.nextInt();
	switch(op)
	{
	case 1: System.out.println("enter radius");
	float r=sc.nextFloat();
	float ac=(float) (3.14*r*r);
	System.out.println("Area of Circle is"+ac);
	break;
	case 2: System.out.println("enter side");
	int x=sc.nextInt();
	int as=x*x;
	System.out.println("Area of Square is"+as);
	break;
	case 3: System.out.println("enter the length and breadth");
	int l=sc.nextInt();
	int b=sc.nextInt();
	int ar=l*b;
	System.out.println("Area of Rectangle is"+ar);
	break;
	}
		
		

	}

}
