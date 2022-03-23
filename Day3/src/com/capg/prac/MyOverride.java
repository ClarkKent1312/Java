package com.capg.prac;

class Override1{
	public void sleep() {
		System.out.println("sleeping in parent class");
	}
}

public class MyOverride extends Override1
{
	
	@Override
	public void sleep() {
		System.out.println("Sleeping in child class");
	}
	
	public void show() {
		System.out.println("Showing");
	}
	
	public static void main(String[] args) {
		MyOverride m = new MyOverride();
		m.sleep();
		System.out.println(m instanceof MyOverride);
		System.out.println(m instanceof Override1);
	}
	
}
