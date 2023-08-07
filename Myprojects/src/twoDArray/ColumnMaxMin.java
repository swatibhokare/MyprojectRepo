package twoDArray;

public class ColumnMaxMin {
	public static void findmax(int arr1[][]) {
		int len = arr1.length;
		System.out.println("--------maximum number in the each column-----------");
		for (int i = 0; i < len; i++) {
			int maxcol = arr1[0][i];
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[j][i] > maxcol) {
					maxcol = arr1[j][i];
				}
			}
			System.out.println(maxcol);

		}

	}

	public static void findmin(int arr1[][]) {
		int len = arr1.length;
		System.out.println("-----------minimum number in the each column-------");
		for (int i = 0; i < len; i++) {
			int mincol = arr1[0][i];
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[j][i] < mincol) {
					mincol = arr1[j][i];
				}
			}
			System.out.println(mincol);
		}
	}

	public static void main(String[] args) {

		int arr[][] = { { 23, 45, 14 }, { 25, 12, 36}, { 58, 74, 69} };
		findmax(arr);
		findmin(arr);
	}

}
