package arrayDemos;
//wap to reverse array order
public class ArrayReverseOder {

	public static void main(String[] args) {
		int arr[]={33,56,67,34,88};
		int i,len=arr.length;
		//print array in reverse order
		System.out.println("___Array in Reverse Order_____");
		for(i=len-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		//limitation of for-each
		//for-each iterates in forward direction only

	}

}
