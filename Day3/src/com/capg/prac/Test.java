package com.capg.prac;

interface Printable{
	void print();
}

interface Show extends Printable{
	void show();
}

public class Test implements Show{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.print();
		
		Printable p = new Printable() {
			public void print() {
				System.out.println("Print super");
			}
		};
		
		Show s = new Show() {
			public void show() {
				System.out.println("Show super");
			}
			
				public void print() {
					System.out.println("Print show super");
				}
			
		};
		
		
		
	}
	
	
}
