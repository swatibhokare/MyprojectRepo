package Interface;

interface Vehical {
	void move();
}

class Car implements Vehical {
	@Override
	public void move() {
		System.out.println("travelling by car");
	}
}

class Bus implements Vehical {
	@Override
	public void move() {
		System.out.println("travelling by bus");
	}
}

class Bike implements Vehical {
	@Override
	public void move() {
		System.out.println("travelling by bike");
	}
}

class Traveller {
	private Vehical v;

	public Vehical getV() {
		return v;
	}

	public void setV(Vehical v) {
		this.v = v;
	}

	public void startJourney() {
		v.move();
	}
}

public class TestLooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Traveller t1=new Traveller();
           t1.setV(new Car());
           t1.startJourney();
           t1.setV(new Bike());
           t1.startJourney();
	}

}
