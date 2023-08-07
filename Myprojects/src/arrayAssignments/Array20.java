package arrayAssignments;

public class Array20 {

	public static void main(String[] args) {
		
		int a[]={-20, 0, -25, 15, 19, 37, 23} ;
		int small1,small2;
		small1=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small1)
			{
				small1=a[i];
			}
		}
		small2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small2 && a[i]!=small1)
			{
				small2=a[i];
			}
		}
		System.out.println(small2);
	}

}
