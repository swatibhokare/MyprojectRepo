package Interface;

import java.io.Serializable;

//single abstract method in interface
@FunctionalInterface
interface Washable {
	void wash();//abstract method

	default void m1() {
	}
}
@FunctionalInterface
interface A {
	void m1();
}
//marker interface
class B implements Serializable
{
	}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
