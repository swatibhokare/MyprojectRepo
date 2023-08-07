package assignment_24_july;

interface Bike {
	default void details() {
		System.out.println("Bike deatils");
	}
}

interface Scooty  extends Bike{
	default void details() {
		Bike.super.details();
		System.out.println("scooty details");
	}
}

class BuySomething implements  Scooty {
	public void details() {
		
		Scooty.super.details();
	}
}

public class AssignmentBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuySomething b = new BuySomething();
		b.details();

	}

}
