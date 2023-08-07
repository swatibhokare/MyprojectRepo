package com.assignmentOops;

public class Car {

	int cmodel;
	String cname;
	int cprice;
	public void acceptdetails(int model,String name,int price)
    {
		
		cmodel=model;
		cname=name;
		cprice=price;
    }
	public void display()

	{
		System.out.println(cmodel+" "+cname+" "+cprice);
	}
	public static void main(String[] args) {
		
		Car cr1=new Car();
		cr1.acceptdetails(2,"suzuki",600000);
		cr1.display();
		
		Car cr2=new Car();
		cr2.acceptdetails(3,"creta",1200000);
		cr2.display();
		
		Car cr3=new Car();
		cr3.acceptdetails(4,"innova",200000);
		cr3.display();	}
		
		
		
		
		
		
	

}
