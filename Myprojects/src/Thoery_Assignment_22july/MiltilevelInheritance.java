package Thoery_Assignment_22july;

class Person {
	Person() {
		System.out.println("Person constructor");
	}
	void nationality(){

		System.out.println("Indian");
	}
	void place()
	{
		System.out.println("Mumbai");
	}
}

class Employee extends Person
{
	Employee()
	{
		System.out.println("Employee constructor");
	}
	void organization()
	{
		System.out.println("IBM");
	}

	void place()
	{
		System.out.println("New York");

	}
}

class Manager extends Employee
{
	Manager()
	{
		System.out.println("Manager constructor");
    }

	void subordinates()
	{
		System.out.println(12);

	}
   void place()
     {

		System.out.println("Pune");
	}

}

public class MiltilevelInheritance {

	public static void main(String[] args) {
		Manager m = new Manager();

		m.nationality();

		m.organization();

		m.subordinates();

		m.place();

	}

}
