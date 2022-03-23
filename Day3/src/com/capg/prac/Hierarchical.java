package com.capg.prac;

class Animal{
	public void eat() {
		System.out.println("in class Animal eating");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("in class Dog barking");
	}
}

class Cat extends Animal{
	public void sleep() {
		System.out.println("in class Cat sleeping");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.bark();
		d.eat();
		
		c.sleep();
		c.eat();
	}
}
