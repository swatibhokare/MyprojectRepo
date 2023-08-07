package Inheritance;

class Mobile{
	String memory="Apple";
}
class Apple extends Mobile{
	public void show()
	{
		System.out.println(memory);
	}

	
	
}
public class SingleInheritance {
	

	public static void main(String[] args) {
		Apple A=new Apple();
		A.show();
	}

}
