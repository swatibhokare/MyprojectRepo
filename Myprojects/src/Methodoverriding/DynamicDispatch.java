package Methodoverriding;

class Fruit {
	public void color() {
		System.out.println("Fruit green");
	}

}

class Apple extends Fruit {
	public void color() {
		System.out.println("Apple:Red");
	}
}

class Banana extends Fruit {
	public void color() {
		System.out.println("Banana:yellow");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object of type fruit
		Fruit f = new Fruit();
//object of type Apple
		Apple a = new Apple();
//object of type banana
		Banana b = new Banana();
		f.color();
		a.color();
		b.color();
		System.out.println("....................");
		Fruit ft;
		// ft=new Fruit();
		ft = f;// ft refering Fruit object
		f.color();
		// ft=new Apple();
		ft = a;// ft referring class apple object
		ft.color();
	}

}
