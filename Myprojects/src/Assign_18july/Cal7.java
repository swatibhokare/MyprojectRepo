package Assign_18july;

public class Cal7 {
	
	public void add(int a,float b)
	{
		System.out.println("1");
	}
	public void add(float a,int b)
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		Cal7 c=new Cal7();
		//c.add(10,10);.............// exception method add(int,float) is ambiguous for type cal7

	}

}
