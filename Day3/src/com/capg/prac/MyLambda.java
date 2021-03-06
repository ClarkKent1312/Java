package com.capg.prac;

@FunctionalInterface
interface show2{
	void show();
}

@FunctionalInterface
interface Add{
	int add(int a, int b, int c);
}

interface Mult{
	int mult(int a, int b);
}

public class MyLambda {
	
	public static void main(String[] args) {
		
		show2 s = () -> {
			System.out.println("Hello");
		};
		s.show();
		
//		Add aa = (int a, int b, int ) -> {
//			return a+b;
//		};
//		
//		System.out.println(aa.add(10, 5));
		
		Add ad = (int a, int b, int c) -> a+b+c;
		Mult ml = (int a, int b) -> a*b;
		System.out.println(ad.add(11, 5, 6));
	}

}
