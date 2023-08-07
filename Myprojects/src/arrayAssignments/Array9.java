package arrayAssignments;

public class Array9 {

	public static void main(String[] args) {
	int a[]= {1,4,5,6,3};
	int arr2[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		arr2[i]=a[i];
	}
	
//	for(int b:arr2)
//	{
//		System.out.println(b);
//	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(arr2[i]);
	}
	}

}
