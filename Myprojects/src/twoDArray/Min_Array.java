package twoDArray;

public class Min_Array {
	
	public static void find2dmin(int [][]arr1)
	{
		
		int len = arr1.length;
		for(int i = 0; i < len; i++)
		{
			int min=arr1[i][0];
			for(int j = 0; j < len+1; j++)
			{
				if(arr1[i][j] < min)
					min = arr1[i][j];
					
			}
			System.out.println( min);

		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][] = {{22, 31, 9}, {12, 25, 16}};
		
		

		find2dmin(arr);
	}

}
