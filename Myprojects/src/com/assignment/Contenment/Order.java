package com.assignment.Contenment;
class MFDate
{
	int dd,mm,yyyy;
	public MFDate(int dd,int mm,int yyyy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	
	public String toString()
	{
		return dd+"/"+mm+"/"+yyyy;
	}
	}

class Product{
	int Product_id;
	String Product_name;
	MFDate mydate;
	public Product(int Product_id,String Product_name,MFDate mydate)
	{
		this.Product_id=Product_id;
		this.Product_name=Product_name;
		this.mydate=mydate;
	}
	public String toString()
	{
		return Product_id+" "+Product_name+" "+mydate;
	}
}
public class Order {
	int Oid;
	Product Pro;
	public Order(int Oid,Product Pro)
	{
		this.Oid=Oid;
		this.Pro=Pro;
	}
	public String toString()
	{
		return Oid+" "+Pro;
	}
	public static void main(String[] args) {
		
		Order O=new Order(20051,new Product(1,"product",new MFDate(13,07,2024)));
		System.out.println(O);
		
	}

}
