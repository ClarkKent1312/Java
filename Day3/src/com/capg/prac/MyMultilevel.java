package com.capg.prac;

class A{
	public void show() {
		System.out.println("in class A");
	}
}

class B extends A{
	public void display() {
		System.out.println("in class B");
	}
}

public class MyMultilevel extends B{
	public void multi() {
		System.out.println("in class MyMultilevel");
	}
	
	public static void main(String[] args) {
		MyMultilevel m = new MyMultilevel();
		m.show();
		m.display();
		m.multi();
	}
}
