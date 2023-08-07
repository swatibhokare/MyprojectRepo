package KalayaniMamMorningAss;

public class Array {

	public static void main(String[] args) {
		int arr[]= {9,4,12,4,8,7,10};
		int len=arr.length;
		int i,j;
		int temp=0;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(i=0;i<arr.length;i++)
		{
			
			
			for(j=i+1;j<3;j++)
			{
				if(i<3)
				{
					if(arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(j=i+3;j>3;j++)
			{
				if(i>3)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
		}
		System.out.println();
		System.out.println("-----------array after sorting--------------");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
