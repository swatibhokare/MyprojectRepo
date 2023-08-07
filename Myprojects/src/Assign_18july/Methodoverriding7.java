package Assign_18july;
class Derived
{
	public void getDetails(String temp)
	{
		System.out.println("Derived class "+temp);
	}
	

}
class Methodoverriding7 extends Derived
{
	public void getDetails(String temp)
	{
		System.out.println("test class"  +temp);
		//return 0;.............//void methods  can not return a value exception  
	}
	
	public static void main(String[] args) {
		Methodoverriding7 m=new Methodoverriding7();
		m.getDetails("hello");
	}

}
