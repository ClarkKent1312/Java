package com.capg.work;

public class MyFinally {
	
	public static void main(String[] args) {
		try {
			int a = 25/0;
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Working");
		}
		System.out.println("Ending");

	}
	
}
