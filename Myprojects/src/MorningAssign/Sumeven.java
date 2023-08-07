package MorningAssign;

public class Sumeven {

	public static void main(String[] args) {
		int sum, lastDigit;
		int number=123456;
	     for(sum=0; number!=0; number/=10)
	     {
	         lastDigit = number%10;
	         if(lastDigit % 2 == 0)
	             sum += lastDigit;
	     }
	  System.out.println(sum);

	}

}
