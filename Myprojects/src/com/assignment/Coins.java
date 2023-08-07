package com.assignment;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Meenu Age:");
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		System.out.println("received coins are :" + (Age * Age * Age));
	}

}
