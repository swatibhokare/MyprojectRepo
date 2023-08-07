package arrayAssignments;

public class Array13 {

	public static void main(String[] args) {
		int a[] = { 1, 12, 1, 45, 3, 6, 7, 1, 3 ,1};
		int count;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			if (a[i] == -1)
				continue;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}

			}
			if (count >= 1) {
				System.out.println(a[i]+" "+count);
			}
		}

	}

}
