package Inheritance;

class Employee
{
	String name="nikita";
	}
class Tester extends Employee
{
	public void show()
	{
		System.out.println(name);
	}
	}
class Devloper extends Employee
{
	public void showDev()
	{
		System.out.println("Dev");
	}
	}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Tester t=new Tester();
		t.show();
		Devloper dev=new Devloper();
		dev.showDev();
	}

}
