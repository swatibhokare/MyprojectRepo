package KalayaniMamMorningAss;

import java.util.Scanner;

public class Primrdigit {
	
	public void Display()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		boolean isprime = true;
		while(num>0)
		{
		int digit=num%10;
		num=num/10;
		for (int i = 2; i<digit; i++) {
			if(digit%i==0)
			{
				isprime=false;
			}
			break;
			
		}
		
		
		}
		
		if(isprime==true)
		{
			System.out.println(digit);
		}
		
	}

	public static void main(String[] args) {
		

	}

}
