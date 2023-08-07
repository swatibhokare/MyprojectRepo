package morning.khadija.mam;

public class Bike {
	String color;
	int price;

	Bike(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public void show() {
		this.display();
	}

	public void display() {
		System.out.println("black");
		System.out.println(100);
	}

	public static void main(String[] args) {

		Bike b = new Bike("black", 100);
		b.show();
	}

}
