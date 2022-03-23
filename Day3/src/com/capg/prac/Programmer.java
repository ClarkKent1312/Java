package com.capg.prac;

class Employee{
	float salary = 10000.00f;
	public void showSalary() {
		System.out.println("Salary is : "+ salary);
	}
}

// IS-A relationship : Programmer is a Employee
public class Programmer extends Employee {
	float bonus = 2000.00f;
	public void showBonus() {
		System.out.println("Bonus is : "+ bonus);
	}
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.showBonus();
		p.showSalary();
		
		
	}
}
