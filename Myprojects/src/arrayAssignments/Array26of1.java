package arrayAssignments;

public class Array26of1 {
	public static void swapTwoArr(int a[])
	{
		int len1=a.length;
		int b[]=new int[len1];
		int index=0;
		for(int i=0;i<len1;i++)
		{
			if(a[i]==a[index])
			{
				b[i]=a[len1-2];
			}
			else if(a[i]==index++)
			{
				b[i]=a[len1-1];
			}
			else if(a[i]==a[len1-2])
			{
				b[i]=a[len1-4];
			}
			else if(a[i]==a[len1-1])
			{
				b[i]=a[len1-3];
			}
			System.out.print(b[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,9,0};
		swapTwoArr(num);
	}

}
