package com.assignmentwhileloop;

import java.util.Scanner;

public class Magicnumber {

	public static void main(String[] args) {
		//take continue input from user and 
				//check gussing number 
				int magic=120;
				Scanner sc=new Scanner(System.in);
				int count=0;
				while(true)
				{
					System.out.println("enter the number");
					int num=sc.nextInt();
					count++;
					if(num>magic)
					{
						System.out.println("Entered number is greater please try again");
						continue;
					}
					else if(num<magic)
					{
						System.out.println("entered number is less please try again..");
						continue;
					}
					else
					{
						System.out.println("Correct gussing.....");
						System.out.println(count);
						break;
					}
					
				}


	}

}
