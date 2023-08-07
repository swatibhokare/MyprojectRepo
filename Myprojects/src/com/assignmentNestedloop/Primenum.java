package com.assignmentNestedloop;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		int num1, num2,  flag = 0, i, j;
		 int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the lower limit :"); 
        num1= sc.nextInt();
        System.out.println ("Enter the upper limit :"); 
        num2 = sc.nextInt();
        System.out.println ("The prime numbers in between the entered limits are :");
        for(i = num1; i <= num2; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.print(i+" ");
               count++;
               
            }
          
        }
		
	}

}
