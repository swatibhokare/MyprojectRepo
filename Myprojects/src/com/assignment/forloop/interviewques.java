package com.assignment.forloop;
//wap to print bet 1 to 20 if no is divisible by 3 then display onex, it is divisible by 5 then print tel, if it is divisible by both then display onextel
public class interviewques {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
		{
			if(i%3==0)
				System.out.println(" Onex");
		}
		for(int i=1;i<=20;i++)
		{
			if(i%5==0)
				System.out.println(" Tel");
		}
		for(int i=1;i<=20;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.println("OnexTel");
				
		}
		
		
	}

}
