package arrayDemos;

public class FindEvenNoFromArray {
	public static void findEvenNums(int a[])
	{
		int i,len=a.length;
		/*for(i=0;i<len;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}*/
		for(int e:a) {
			
			if(a[e]%2==0)
			{
				System.out.println(a[e]);
			}
		}	}

	public static void main(String[] args) {
		
         int number[]= {12,5,10,4,24,15};
         System.out.println("even numbers from array");
         findEvenNums(number);
	}

}
