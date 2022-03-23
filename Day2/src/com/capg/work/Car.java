package com.capg.work;

public class Car {
	static String name; // class variable
	String color; // instance variable
	int speed; // instance variable
	
	public static void main(String[] args) {
		Car c = new Car();
		
		c.speed = 200;
		System.out.println(c.speed);
		
		Car.name = "BMW";
		System.out.println(Car.name);
	}
}
