package com.assignmentOops;

import java.util.Scanner;

public class Student {
	
	int sid;
	String sname;
	int sage;
	public void acceptdetails(int id,String name,int age)
	{
	
		sid=id;
		sname=name;
		sage=age;
		
	}
	public void display()
	{
		System.out.println(sid+" "+sname+" "+sage);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Student stud1=new Student();
		System.out.println("enter a id");
		stud1.sid=sc.nextInt();
		System.out.println("enter student name");
		stud1.sname=sc.nextLine();
		System.out.println("enter student age");
		stud1.sage=sc.nextInt();
		System.out.println("enter student id" +stud1.sid);
		System.out.println("enter student name:"+stud1.sname);
		System.out.println("enter student age:"+stud1.sage);
		stud1.display();

	}

}
