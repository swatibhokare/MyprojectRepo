package Interface;

interface Cng_Car {
	void drivee();

	void cng_car_kit();

}

interface Petrol_Car {
	void drive();

	void petrol_car_kit();
}

class HybridCar implements Cng_Car, Petrol_Car {
	public void drive() {
		System.out.println("driving a hybrid car");
	}

	public void petrol_car_kit() {
		System.out.println("petrol kit");
	}

	public void cng_car_kit() {
		System.out.println("cng kit");
	}
}

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridCar h = new HybridCar();
		h.drive();
		h.petrol_car_kit();
		h.cng_car_kit();
	}

}
