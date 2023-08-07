package com.assignmentOops;

public class AccountDetails {
	int cid;
	String cname;
	int cbalance=10000;
	public AccountDetails(int id,String name,int balance)
    {
		cid=id;
		cname=name;
		cbalance=balance;
		
	}
	public void display()
    {
		System.out.println(cid+" "+cname+" "+cbalance);
		
	}
	public  void withdraw()
	{    int withdrawl=0;
	      
		int balance=balance- withdrawl;
		
	}
	public void deposit()
	{
		int dep= balance+dep;
	}
	public static void main(String[] args) {
		
	}

}
