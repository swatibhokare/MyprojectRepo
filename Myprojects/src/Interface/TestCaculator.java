package Interface;
interface Calculator{
	public int addition(int a,int b);
	public int subtraction(int a,int b);
	public int multiplication(int a,int b);
	public int division(int a,int b);
	default void display()
	{
		System.out.println("default method in interface");
	}
}
class BasicCal implements Calculator
{
public int addition(int a,int b)
{
	return a+b;
	}
public int subtraction(int a,int b)
{
	return a-b;
	}
public int multiplication(int a,int b)
{
	return a*b;
	}
public int division(int a,int b)
{
	return a/b;
	}
	
}

public class TestCaculator {

	public static void main(String[] args) {
		
        BasicCal b=new BasicCal();
        System.out.println("addition: "+b.addition(12, 5));
        System.out.println("subtraction: "+b.subtraction(15,4));
        System.out.println("multiplication: "+b.multiplication(25, 2));
        System.out.println("division: "+b.division(12, 2));
        b.display();
	}

}
