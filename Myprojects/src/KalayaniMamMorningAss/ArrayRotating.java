package KalayaniMamMorningAss;

public class ArrayRotating {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7};
		int lastindex=arr.length-1;
		int lastindexvalue=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[lastindex]=arr[i];
			lastindex--;
			if(i==0)
			{
				arr[i]=lastindexvalue;
			}
			
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}

}
