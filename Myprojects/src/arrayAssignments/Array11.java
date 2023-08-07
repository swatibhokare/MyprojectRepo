package arrayAssignments;

public class Array11 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int even[]=new int[a.length];
		int odd[]=new int[a.length];
		int ieven=0;int iodd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[ieven]=a[i];
				System.out.print("Even numbers are:"+a[i]+" ");
				//System.out.println("even numbers are:"+a[i]);
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				odd[iodd]=a[i];
				System.out.print("Odd numbers are:"+a[i]+" ");
				//System.out.println("odd numbers are:"+a[i]);
			}
			
		}
		

	}

}
