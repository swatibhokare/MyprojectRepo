package Interface;
//cloneable
class Employee implements Cloneable
{ int eid;
String name;
double esal;

Employee (int eid,String name,double esal)
{this.eid=eid;
this.name=name;
this.esal=esal;
	}
@Override
public String toString()
{return "employee eid="+eid+",name="+name+",esal="+esal;
	}
	}

public class TestCloneObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
