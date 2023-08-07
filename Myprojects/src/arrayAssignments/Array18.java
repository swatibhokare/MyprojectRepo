package arrayAssignments;

public class Array18 {

	public static void main(String[] args) {
		int a[] = { -2, 3, 5, -9, 6, 8, 7 };
		int temp;
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Asending order:");
		for (int i = 0; i <=a.length-1; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
