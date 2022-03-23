package com.capg.work;

public class Student {
 
//	static String name; // class variable
//	int rollNo; // instance variable
//	
//	void display (int r) { //r here is local variable
//		
//	}
	
	String name;
	int rollNo;
	
	Student(){
		System.out.println("Student is studying default constructor");
	}

	Student(int rollNo) {
		this.rollNo = rollNo;
	}

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	void display() {
		System.out.println(rollNo+ " "+ name);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		
		Student s1 = new Student(30);
		s1.display();
		
		Student s2 = new Student("Mohit", 34);
		s2.display();
	}

	
}
