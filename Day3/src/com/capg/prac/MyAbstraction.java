package com.capg.prac;

abstract class abstraction {
	abstract void show();
	void display() {
		System.out.println("Displaying");
	}
	
	abstraction(){
		System.out.println("constructor super");
	}
	
	final static void msg() {
		System.out.println("Messaging");
	}
}

public class MyAbstraction extends abstraction{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}
	
	public static void main(String[] args) {
		MyAbstraction m = new MyAbstraction();
		
		m.show();
		m.display();
		
		
		abstraction n = new abstraction() {
			@Override
			void show() {
				System.out.println("Showing in super");
			}
		};
		
		n.show();
		
		m.msg();
		n.msg();
		
		
		
		
		
		
	}
	
}
