package KalayaniMamMorningAss;
//{3,1,7,8}
//o/p:{8,7,1,3}

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]= {3,1,7,8};
		int lastindex=arr.length-1;
		int lastindexvalue=arr[arr.length-1];
		System.out.println("array={3,1,7,8}");
		System.out.println("--------------array after sorting-----------");
		System.out.print("{");
		for(int i=arr.length-1;i>=0;i--)
		{
			arr[lastindex]=arr[i];
			lastindex--;
			System.out.print(arr[i]+" " );
		}
         System.out.println("}");
	}

}
