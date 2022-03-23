package com.capg.work;

public class Student2 {
	
	String name;
	int id;
	
	
	

	Student2(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void display() {
		System.out.println(name +" " + id );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu = new Student2("Rohit", 13);
		stu.display();
	
	}

}
