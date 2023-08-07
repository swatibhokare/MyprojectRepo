package arrayAssignments;

public class Array15 {

	public static void main(String[] args) {
		int a[]={10,20,15,42,48} ;
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
