package arrayAssignments;

public class Array25 {
public static void findCommonElements(int a[],int b[]) {
		
		int i,j,len1=a.length,len2=b.length;
		boolean result=false;
		for(i=0;i<len1;i++) {
			for(j=0;j<len2;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					result=true;
				}
			}
		}
		if(result==false) {
			System.out.println("no common elements");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {12, 23, 34, 67 ,78, 91, 56};
		int arr2[]= {39, 25, 15, 23, 55, 91, 66, 22};
		findCommonElements(arr1, arr2);
	}

}
