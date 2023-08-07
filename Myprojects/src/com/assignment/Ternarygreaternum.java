package com.assignment;

public class Ternarygreaternum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=3;
int num2= 4;
int num3= 6;
String str = num1>num2 ?num1>num3?"num1":"num3":num2>num3?"num2":"num3";
System.out.println(str);
String result=num1>num2?"num1 is greater":"num2 is greater";
System.out.println(result);
	}

}
