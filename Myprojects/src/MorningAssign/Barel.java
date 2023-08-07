package MorningAssign;

import java.util.Scanner;

public class Barel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of barel");
		
		int quantity=sc.nextInt();
		for(int i=1;i<=quantity;i++)
		{
			int price=89;
			if(i>=10)
			{
				price=(i*price)-i;
			}
			else {
				price=i*price;
			}
			System.out.println("price of barel" + i +"is:" + price);
		}
		
		
	}

}
