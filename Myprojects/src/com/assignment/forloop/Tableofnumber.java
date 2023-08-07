package com.assignment.forloop;
//Display table of given number.
import java.util.Scanner;

public class Tableofnumber {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(num+"*"+i+"="+num*i);
	}
	}

}
