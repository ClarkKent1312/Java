package com.capg.work;

public class MyException {

	public static void main(String[] args) {
		try {
			int a = 100/0;
			
			String s = null;
			System.out.println(s.length());

			
			String b = "Shyam";
			int i = Integer.parseInt(b);
			
			int arr[] = new int[5];
			arr[10]=23;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("Ending");

	}
	
}
