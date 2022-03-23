package com.capg.work;

public class Person {
	
	public static void main(String[] args) {
		int a = 10;
		
		Integer ai = new Integer(a); // Boxing
		System.out.println("ai = "+ai);
		
		Integer bi = a; // AutoBoxing 
		System.out.println("bi = "+bi);
		
		int j = bi.intValue();
		System.out.println("j = "+j);
		
		int k = bi;
		System.out.println("k = "+k);
		
		
				
		
		
	}
	
}
