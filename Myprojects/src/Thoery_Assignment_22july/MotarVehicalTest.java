package Thoery_Assignment_22july;
/*
 * . Create an abstract class MotorVehicle with the following details: Data Members: (a)
modelName (b)modelNumber (c) modelPrice Methods: (a) display() to show all the details
Create a subclass of this class Carthat inherits the class MotorVehicle and add the following
details: Data Members: (b) discountRate Methods: (a) display() method to display the Car
name, model number, price and the discount rate. (b) discount() method to compute the
discount

 */
abstract class MotorVehicle {
    protected String modelName;
    protected long modelNumber;
    protected double modelPrice;

    public MotorVehicle(String modelName, long modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    abstract public void display();

}

class Car1 extends MotorVehicle {
    double discountRate;

    public Car1(String modelName, long modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Model price: " + modelPrice);

    }

    public void discount() {
        double discountedPrice = modelPrice * (1 - (discountRate / 100));

        System.out.println("Discounted Price: " + discountedPrice);
    }
}


public class MotarVehicalTest {

	public static void main(String[] args) {
		
		Car1 c = new Car1("Tata Nano", 1239658741, 650000, 4.5);
        c.display();
        c.discount();
	}

}
