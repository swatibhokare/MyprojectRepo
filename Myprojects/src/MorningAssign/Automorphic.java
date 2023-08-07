package MorningAssign;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int square = num * num;
		int count=0;
		while (num > 0) {
			int rem=num%10;
			count++;
			num=num/10;
			
		}
		int mod=1;
		for(int i=1;i<=count;i++)
		{
			mod= mod*10;
		}
		if(square%mod==num)
		{
		System.out.println("Automorphic");
		}
		System.out.println("not Automorphic");
	}

}
