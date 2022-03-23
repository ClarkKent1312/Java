package com.capg.prac;

interface MyInterface1{
	int a=5;
	void show();
}

interface MyInterface2{
	int a=12;
	void show();
}


public class MyInterface implements MyInterface1, MyInterface2{
	
	@Override
	public void show() {
		System.out.println("Showing");
	}
	
	public static void main(String[] args) {
		MyInterface m = new MyInterface();
		
		m.show();
		System.out.println(MyInterface1.a + MyInterface2.a);
//		System.out.println(MyInterface.a);
//		System.out.println(MyInterface1.a);
		
		MyInterface1 mn = new MyInterface() {
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("interface show");
			}
		};
		
//		mn.show();
		
	}
	
}
