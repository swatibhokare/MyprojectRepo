package com.assignmentNestedloop;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
					
				}
				else
				{
					System.out.print(1);
				}
				
			}
			System.out.println();
		}
	}

}
