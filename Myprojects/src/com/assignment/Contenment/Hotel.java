package com.assignment.Contenment;

class menu_item {
	int item_id;
	String item_name;
	int price;

	public menu_item(int item_id, String item_name, int price) {
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
	}

	public String toString() {
		return item_id + " " + item_name + " " + price;
	}
}

class menu {
	int m_id;
	String m_name;
	menu_item mit;

	public menu(int m_id, String m_name, menu_item mit) {
		this.m_id = m_id;
		this.m_name = m_name;
		this.mit = mit;
	}

	public String toString() {
		return m_id + " " + m_name + " " + mit;
	}
}

public class Hotel {
	int Hotel_id;
	String Hotel_name;
     menu m;

	public Hotel(int Hotel_id, String Hotel_name, menu m) {
		this.Hotel_id = Hotel_id;
		this.Hotel_name = Hotel_name;
		this.m =m;
	}

	public String toString() {
		return Hotel_id + " " + Hotel_name + " " + m;
	}

	public static void main(String[] args) {

		Hotel H = new Hotel(20010,"Taj", new menu(2, "maharatrian", new menu_item(30, "puran poli", 100)));
		System.out.println(H);
	}

}
