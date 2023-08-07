package com.assignmentOops;

public class ThisKeyUse {
	int x;
	public void input(int x)
	{
		this.x=x;
	}
	public void foo()
	{
		this.show();
		System.out.println("HIi java");
	}

	public void show()
	{
	
		System.out.println("Student");
		System.out.println(x);

	}


	public static void main(String[] args) {
		
		ThisKeyUse t=new ThisKeyUse();
		t.foo();
		t.input(200);
	}

}
