package com.assignmentNestedloop;

public class Trimorphic {

	public static void main(String[] args) {
		int n=25;
		int cube=n*n*n;
		while(n!=0)
		{
			if(n%10!=cube%10)
			{
				System.out.print("not a trimorphic");
				break;
			}
			n=n/10;
			cube=cube/10;
			
		}
		if(n==0)
		{
			System.out.print("trimorphic");
		}
	}

}
