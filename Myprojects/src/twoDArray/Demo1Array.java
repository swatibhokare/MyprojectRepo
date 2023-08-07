package twoDArray;

public class Demo1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int mat[][];
         mat=new int[3][3];
         //or
         int arr[][]=new int[2][2];
         //or
         int rows=4;
         int cols=3;
         int arr1[][]=new int [rows][cols];
         
         //accsesing 2d array
         System.out.println("----Elements in 2d array________");
         System.out.println(arr[0][0]);
         System.out.println(arr[0][1]);
         System.out.println(arr[1][0]);
         System.out.println(arr[1][1]);
         
         System.out.println("--------After inserting elemnts------------");
         arr[0][0]=52;
         arr[0][1]=43;
         arr[1][0]=23;
         arr[1][1]=45;
         System.out.println(arr[0][0]);
         System.out.println(arr[0][1]);
         System.out.println(arr[1][0]);
         System.out.println(arr[1][1]);
         
         
         System.out.println("-------elements in 2d array using for loop----------------");
         
         for(int i=0;i<2;i++) {
        	 for(int j=0;j<2;j++)
        	 {
        		 System.out.print(arr[i][j]+" \t");
        		 
        	 }
        	 System.out.println();
         }
         }

}
