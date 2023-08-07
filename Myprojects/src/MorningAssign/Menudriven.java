package MorningAssign;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Deposit\n2.Withdraw\n3.Available Balance\n4.Exit");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		int Balance=10000;
		switch (choice) {
		case 1:
		int	dep =sc.nextInt();
			Balance= Balance+dep;
			System.out.println("your balance is :" +Balance);
			
		break;
		case 2:
			 int with=sc.nextInt();
			Balance=Balance-with;
			System.out.println("your withdrwal amount is :" +Balance);
			break;
		case 3:
			System.out.println(Balance);
			break;
		case 4:
			System.exit(0);
			}
		

	}	

	


}
