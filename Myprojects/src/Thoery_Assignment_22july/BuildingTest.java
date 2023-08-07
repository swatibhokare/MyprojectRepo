package Thoery_Assignment_22july;
/*
 * Create a base class Building that stores the number of floors of a building, number of rooms
and it’s total footage. Create a derived class House that inherits Building and also stores the
number of bedrooms and bathrooms. Demonstrate the working of the classes. create a
second derived class Office that inherits Building and stores the number of telephones and
tables. Now demonstrate the working of all three classes
 */

class House extends Building {
	private int numBedrooms, numBathrooms;

	public House(int numFloors, int numRooms, float floorArea, int numBedrooms, int numBathrooms) {
		super(numFloors, numRooms, floorArea);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
	}

	public void showData() {
		super.showData();
		System.out.println("Number of Floors: " + numFloors);
		System.out.println("Number of rooms: " + numRooms);
		System.out.println("Floor Area: " + floorArea);
		System.out.println("Number of Bedrooms: " + numBedrooms);
		System.out.println("Number of Bathrooms: " + numBathrooms);
	}
}

public class BuildingTest {

	public static void main(String[] args) {
		House h = new House(3, 8, 1500, 3, 4);
		h.showData();

	}

}
