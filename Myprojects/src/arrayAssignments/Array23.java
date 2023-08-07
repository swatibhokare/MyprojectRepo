package arrayAssignments;

public class Array23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33, 90, 45, 29, 37, 78};
		int i,len=arr.length;
		
		//print array in reverse order
		
		System.out.println("----Array in Reverse Order----");
		System.out.print("[");
		for(i=len-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}

}
