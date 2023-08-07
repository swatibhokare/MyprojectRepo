package morning.khadija.mam17july;

import morning.khadija.mam.Student;

public class AccessModify extends Student{

	public static void main(String[] args) {
		AccessModify am=new AccessModify();
		am.doProtected(22345);  //protected is accessible within same package 
	}

}
