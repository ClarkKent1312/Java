package com.capg.prac;

class MySuper1{
	public String name = "Aman";
	public void sleep() {
		System.out.println("Aman is Sleeping");
	}
	public MySuper1() {
		System.out.println("super1 constructor");
	}
	
}

public class MySuper extends MySuper1{
	public String name = "Rohan";
	
	public void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void sleep() {
		System.out.println("Rohan is Sleeping");
		super.sleep();
	}
	
	
	
	public MySuper() {
		System.out.println("super constructor");
	}

	public static void main(String[] args) {
		MySuper m = new MySuper();
//		m.display();
//		m.sleep();
	}

}
