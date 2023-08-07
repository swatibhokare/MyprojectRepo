package Interface;

interface interfaceA {
	//default methods present in interface is implicitly public.
	//we can not use any other access modifiers to default method.
	default void show() {
		System.out.println("show method of interfaceA");
	}
}
interface interfaceB
{default void show()
	{
	System.out.println("show method of interfaceB");
	}
	}
class Child implements interfaceA,interfaceB{
	public void show()
	{/*we have invoked the method by an interface name bcz of this there is no ambiguity error.
	*/
		interfaceA.super.show();
		interfaceB.super.show();
	}
}

public class TestDiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Child c=new Child();
          c.show();
	}

}
