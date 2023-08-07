package assignment_24_july;

interface Account {
	public void withdraw();

	public void display();

	static void aboutBank() {
		System.out.println("aboutbank");
	}

	default void takeLoan() {
		System.out.println("defaultMethod");
	}
}

class Saving implements Account {
	public void withdraw() {
		System.out.println("withdraw method in saving class");
	}

	public void display() {
		System.out.println("display method in saving class");
	}

	public void takeLoan() {
		System.out.println("takeloan method is oveeriden");
	}

}

class Current implements Account {
	public void withdraw() {
		System.out.println("withdraw method in current class");
	}

	public void display() {
		System.out.println("display method in current class");

	}

}

public class AsignmentAccount {

	public static void main(String[] args) {
		Saving s = new Saving();
		s.display();
		s.withdraw();
		s.takeLoan();
		Current c = new Current();
		c.display();
		c.withdraw();
	}

}
