package com.assignmentOops;

public class Product {
      int pid;
      String pname;
      int pprice;
      int pquantity;
      int bill;
      
      public void acceptdetails(int id,String name,int price,int quantity)
      {
    	  pid=id;
    	  pname=name;
    	  pprice=price;
    	  pquantity=quantity;
      }
      public void bill()
       {
    	  if(pquantity>0)
    	  {
    		bill=pquantity*pprice; 
    		System.out.println(bill);
    	  }else
    	  {
    		  System.out.println("error");
    	  }
    	  
       }
      public void display()
      {
    	  System.out.println(pid+" "+pname+" "+pprice+" "+pquantity+" "+bill);
      }
	public static void main(String[] args) {
		Product pr=new Product();
		pr.acceptdetails(1,"choclate",10,2);
		pr.bill();
		pr.display();
		
	}

}
