package Assign_18july;

class Person{
	public void readscript()
	{
		System.out.println("person");
	}
}

class Actor extends Person{
	
	public void readscript()
	{
		System.out.println("actor");
	}
}

public class Methodoverriding8 {

	public static void main(String[] args) {
		 
		Person p=new Person();
		p.readscript();
	}

}
