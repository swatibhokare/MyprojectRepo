package Inheritance;

class Fruit{
	String name="Banana";
}

class Banana extends Fruit
{
	public void show()
	{
		System.out.println(name);
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		Banana b=new Banana();
		b.show();
	}

}
