package theoryTest_4_Aug_Array;
//0 0 0 0 
//0 0 0 1 
//0 0 1 1                                                                    
//0 1 1 1 

public class Fourthexample {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
        arr[0][0]=0;
        arr[0][1]=0;
        arr[0][2]=0;
        arr[0][3]=0;
        arr[1][0]=0;
        arr[1][1]=0;
        arr[1][2]=0;
        arr[1][3]=1;
        arr[2][0]=0;
        arr[2][1]=0;
        arr[2][2]=1;
        arr[2][3]=1;
        arr[3][0]=0;
        arr[3][1]=1;
        arr[3][2]=1;
        arr[3][3]=1;
        for(int i=0;i<4;i++) {
       	 for(int j=0;j<4;j++)
       	 {
       		 System.out.print(arr[i][j]);
       		 
       	 }
       	 System.out.println();
        }
        
	}

}
