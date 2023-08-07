package MorningAssign;

import java.util.Scanner;

public class Milkoil {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the quantity of milk");
		float milkq=sc.nextFloat();
		System.out.println("enter the quantity of oil");
		float oilq=sc.nextFloat();
		while(milkq>0&&oilq>0)
		{
			float totalmilk=40*milkq;
			float totaloil=50*oilq;
			if(totalmilk>500&&totaloil>500)
			{
				System.out.println("quantity of milk is:"+milkq);
				System.out.println("quantity of oil is:"+oilq);
				break;
			}
			else {
				System.out.println("enter some more quantity of milk and oil");
			break;
			}
			
		}

	}

}
