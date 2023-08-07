package MorningAssign;

import java.util.Scanner;

public class Increasingnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int id=num%10;
		num=num/10;
		boolean isIncreasing=true;
		while(num>0)
		{
			int cd=num%10;
			if(cd>=id)
			{
				isIncreasing=false;
				break;
			}
			id=cd;
			num=num/10;
		}
		if(isIncreasing)
		{
			System.out.println("the number is increasing");
		}else {
			System.out.println("the number is not increasing");
		}
	}

}
