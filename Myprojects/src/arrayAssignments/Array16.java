package arrayAssignments;

public class Array16 {
	

	public static void main(String[] args) {
		int a[] = { 2, 2, 1, 5, 4, 6, 6 };
		int frequency[] = new int[a.length];
		int counted = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					frequency[j] = counted;

				}
			}
			if (frequency[i] != counted)
				frequency[i] = counted;
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] == counted)
				System.out.println("array Element:" + a[i] + "Frequency:" + frequency[i]);
		}
	}
}
