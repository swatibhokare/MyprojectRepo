package assignment_24_july;

class Shape {
	void draw() {
		System.out.println("shape draw");
	}

	void erase()

	{
		System.out.println("shape erase");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle draw");
	}

	void erase() {
		System.out.println("Circle erase");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle erase");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Square draw");
	}

	void erase() {
		System.out.println("Square erase");
	}
}

public class Shapes {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.draw();
		s.erase();
	}

}
