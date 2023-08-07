package twoDArray;

public class DemoArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int mat[][]= {{37,78},{23,89}};
  int i,j;
  int transpose[][]=new int [2][2];
  for(i=0;i<2;i++)
  {
	  for(j=0;j<2;j++)
	  {
		  transpose[j][i]=mat[i][j];
	  }
  }
  System.out.println("---------mat-------");
  for(i=0;i<2;i++)
  {
	  for(j=0;j<2;j++)
	  {
		  System.out.print(mat[i][j]+" \t");
	  }
	  System.out.println();
  }
  System.out.println("-----transpose-----");
  for(i=0;i<2;i++)
  {
	  for(j=0;j<2;j++)
	  {
		  System.out.print(transpose[i][j]+"\t");
	  }
	  System.out.println();
  }
	}

}
