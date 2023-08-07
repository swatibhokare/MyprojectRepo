package Methodoverriding;

class Bike1{
	String clr="red";
	int speed=100;
	
	public void BikeInfo() {
		System.out.println(clr);
		System.out.println(speed);
		
	}
}

class Pulsor extends Bike1{
	  String clr="black";
	 
	public void BikeInfo()
	{
		System.out.println(clr);
	}
}
public class Methodoverride1 {

	public static void main(String[] args) {
		Bike1 b=new Bike1();
		b.BikeInfo();
		Pulsor p=new Pulsor();
		p.BikeInfo();
	}

}
