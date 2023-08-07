package Inheritance;

 class Vehical{
	 String type="bike";
 }
 
 class Bike extends Vehical{
	 String name;
	 public void show()
	 {
		 System.out.println(type);
	 }
	 
 }
 class Bullet extends Bike
 {
	 public void input()
	 {
		 name="Bullet";
	 }
	 public void output()
	 {
		 System.out.println(name);
	 }
 }

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Bullet b=new Bullet();
		b.input();
		b.output();
		b.show();
		System.out.println(b.type);
	}

}
