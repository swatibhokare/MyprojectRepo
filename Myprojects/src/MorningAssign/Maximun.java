package MorningAssign;

public class Maximun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1245;
int max=5;
int rem;
while(num>0)
{
	rem=num%10;
	if(max<rem)
	{
	max=rem;	
	}
	num=num/10;
}
System.out.println(max);
	}

}
