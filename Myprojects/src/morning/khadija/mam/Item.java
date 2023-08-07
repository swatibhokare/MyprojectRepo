package morning.khadija.mam;

public class Item {
	int itemid=4;
	String itemname="choclate";
	int price=10;
	
public void display()
{
	System.out.println(itemid +" "+ itemname +" "+price);
}

	public static void main(String[] args) {
		Item it=new Item();	
		it.display();
	}

}
