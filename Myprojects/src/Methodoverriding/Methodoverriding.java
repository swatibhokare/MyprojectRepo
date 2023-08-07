package Methodoverriding;
//rule1----child class method hav same name and same parameters which is present in parent class....
//rule 2----same access specifier or higher than it
//rule 3---prent class and child class have same return type

class Vehical
{
	protected void color()
	{
		System.out.println("parent class");
	}
	
	}
class Bike extends Vehical{
	@Override
	//public int color()
	//public String color()
	public void color()
	{
		System.out.println("child class");
	}
}


public class Methodoverriding {
	
	public static void main(String []args)
	{
		Vehical v=new Vehical();
		v.color();
		Vehical v1=new Bike();
		v.color();
		Bike b=new Bike();
		b.color();
	}

	
}
 