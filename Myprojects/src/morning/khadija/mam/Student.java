package morning.khadija.mam;

public class Student {

	private int rollNo;
	protected int admissionNo;
	int age=23;
	public int courseId;

	public void doPublic(int courseId) {
		System.out.println("Public Accees : " + courseId);
	}

	void doDefault(int age) {
		System.out.println("Default Access : " + age);
	}

	protected void doProtected(int admissionNo) {
		System.out.println("Protected Access :" + admissionNo);
	}

	private void doPrivate(int rollNo) {
		System.out.println("Private Access :" + rollNo);
	}

	

}
