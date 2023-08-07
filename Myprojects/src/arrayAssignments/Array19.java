package arrayAssignments;

public class Array19 {

	public static void main(String[] args) {
		int a[]={20, 0, 31, 45, 100, 1, 105, 90};
		int high1,high2;
		high1=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high1)
			{
				high1=a[i];
			}
		}
		high2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high2 && a[i]!=high1)
			{
				high2=a[i];
			}
		}
		System.out.println(high2);

	}

}
