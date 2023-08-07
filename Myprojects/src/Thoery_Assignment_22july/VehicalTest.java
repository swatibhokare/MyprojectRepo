package Thoery_Assignment_22july;
/*
 * Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private
instance variables routeNumber in Bus and manufacturerName in Car and both of them
having showData ( ) method showing all details of Bus and Car respectively with content of
the super class’s showData ( ) method.

 */
class Vehicle {
    protected int regnNumber, speed;
    protected String color, ownerName;

    public Vehicle(int regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is Vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);

    }
}

class Car extends Vehicle {
    private String manufactureName;

    public Car(int regnNumber, int speed, String color, String ownerName, String manufactureName) {
        super(regnNumber, speed, color, ownerName);
        this.manufactureName = manufactureName;
    }

    public void showData() {
        super.showData();
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacture Name: " + manufactureName);

    }
}



public class VehicalTest {

	public static void main(String[] args) {
		 Bus b = new Bus(1, 100, "Red", "Swati", 13);
	        Car c = new Car(2, 200, "Blue", "Sachin", "Tata");
	        b.showData();
	        System.out.println("--------------------------------");
	        c.showData();
		

	}

}
