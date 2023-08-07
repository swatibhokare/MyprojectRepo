package arrayAssignments;

public class Array22 {
	public static void arrayreverse(int temp[])
	{
		System.out.println("----Array in Reverse Order----");
		System.out.print("[");
		for( int i=temp.length-1;i>=0;i--) {
			System.out.print(temp[i]+" ");
		}
		System.out.println("]");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33, 90, 45, 29, 37, 78};
		
		arrayreverse(arr);
		//print array in reverse order
		
		
	}

}
