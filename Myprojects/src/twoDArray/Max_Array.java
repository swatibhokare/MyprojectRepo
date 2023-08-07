package twoDArray;

public class Max_Array {
	public static void find2dmax(int [][]arr1)
	{
		
		int len = arr1.length;
		for(int i = 0; i < len; i++)
		{int max=arr1[0][0];
			for(int j = 0; j < len+1; j++)
			{
				if(arr1[i][j] > max)
					max = arr1[i][j];
					
			}
			System.out.println( max);

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{22, 31, 9}, {12, 25, 16}};
	     find2dmax(arr);	
	}

}
