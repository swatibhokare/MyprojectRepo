package MorningAssign;

public class HarshadNum {

	public static void main(String[] args) {
		int num=153;
		int rem=0;
	    int sum=0;
	    int n=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
			if(n%sum==0)
			{
				System.out.println(n +"is harshad number");
			}
			else
			{
				System.out.println(n +"is not harshad number");
			}
		
	}

}
