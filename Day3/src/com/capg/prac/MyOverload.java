package com.capg.prac;

class Addition{
	static int add(int a, int b) {
		System.out.println("int datatype");
		return a+b;
	}
	
	static double add(double a, double b) {
		System.out.println("double datatype");
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("different parameters");
		return a+b+c;
	}
}

public class MyOverload {
	
	public static void main(String[] args) {
		System.out.println(Addition.add(15,7));
		System.out.println(Addition.add(12.0d,7));
		System.out.println(Addition.add(15,7,8));
	}

}
