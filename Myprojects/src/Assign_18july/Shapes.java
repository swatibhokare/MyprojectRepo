package Assign_18july;
class Shape{
	
	public void draw()
	{
		System.out.println("shape");
	}
	
}
class Rectangle extends Shape
{
  public void draw()
  {
	  System.out.println("rectangle");
  }
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("circle");
	}
	}

public class Shapes {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.draw();
	}

}
