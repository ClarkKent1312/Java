package com.capg.work;

public class Method {
	
	public void hello() {
		System.out.println("Hello!");
	}
	
	public void multiply3(int a, int b, int c ) {
		int d = a*b*c;
		System.out.println(d);
	}
	
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m = new Method();
		
		m.multiply3(5,2,4);
		m.hello();
		System.out.println(m.add(2, 3));

	}

}
