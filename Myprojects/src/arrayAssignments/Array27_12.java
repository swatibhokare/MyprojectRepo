package arrayAssignments;

class GSNum {
	public static int findMax(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMin(int[] arr) {
		int mini = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < mini) {
				mini = arr[i];
			}
		}
		return mini;
	}

	public static int findMissingNo(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]-arr[i]!= 1) {
				sum=arr[i]+1;
			}
		}
		return sum;
		
	}
	
}

public class Array27_12 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 7, 8 ,10};

		System.out.println("Maximum number is:" + GSNum.findMax(num));
		System.out.println("minimum number is :" + GSNum.findMin(num));
		System.out.println("missing number is:" + GSNum.findMissingNo(num));
	}

}
