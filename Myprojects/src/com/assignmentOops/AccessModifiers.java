package com.assignmentOops;

public class AccessModifiers {
	private int i = 0;
	String name = "id";
	protected int x = 10;
	public int a = 3;

	public void doprivate() {
		System.out.println("Name : " + doprivate("Swati"));
	}

	public String doprivate(String name) {
		return name;

	}

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.doprivate();
	}

}
