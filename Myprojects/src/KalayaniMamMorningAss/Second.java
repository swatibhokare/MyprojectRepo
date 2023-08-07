package KalayaniMamMorningAss;

public class Second {

	public static void main(String[] args) {
		int num = 7523;
		int first=0;
		int last = num % 10;
		int sum=0;
		while(num>0)
		{
			first=num%10;
			num = num / 10;
		}
		 sum= last+first ;
		System.out.println("sum is"+ sum);
		}
	}
