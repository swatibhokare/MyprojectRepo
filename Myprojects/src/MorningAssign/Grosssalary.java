package MorningAssign;

import java.util.Scanner;

public class Grosssalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter the basic salary");
 int bs= input.nextInt();
 float hra,da;
 if(bs<=10000)
 {
	 hra=bs*0.25f;
	 da=bs*0.8f;
 }else if(bs<=20000){
	 hra=bs*0.25f;
	 da=bs*0.9f;
	}
 else {
	 hra=bs*0.3f;
	 da=bs*0.95f;
	 }
 System.out.println("Gross Salary :" +(bs+hra+da));
 }

}
