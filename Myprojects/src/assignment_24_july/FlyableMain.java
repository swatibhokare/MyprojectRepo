package assignment_24_july;

interface Flyable {
 void fly_obj();
}
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}

public class FlyableMain {

	public static void main(String[] args) {
		Spacecraft s=new Spacecraft();
		s.fly_obj();
		Airplane a=new Airplane();
		a.fly_obj();
	}

}
