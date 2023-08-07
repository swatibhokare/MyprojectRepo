package arraylab.model;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Books b[];
     b=new Books[4];
     b[0]=new Books(1201,"wings of fire",200f);
     b[1]=new Books(1012,"java",400f);
     b[2]=new Books(1230,"html",200f);
     b[3]=new Books(1402,"javascript",300f);
     System.out.println("-----Details of Books-------");
     for(int i=0;i<b.length;i++)
     {
    	 System.out.println(b[i]);
     }
     System.out.println("-----for each loop----");
     for( Books s:b)
     {
    	 System.out.println(s);
     }
     
     
     
     }

}
