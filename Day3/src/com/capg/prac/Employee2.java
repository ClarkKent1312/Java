package com.capg.prac;

public class Employee2 {
	
	int id;
	String name;
	Address address;
	
	Employee2(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	} 
	
	void display() {
		System.out.println("id: "+ id + " name: "+ name);
		System.out.println(address);
		//System.out.println(address.city+ " " + address.state+ " " + address.country);
	}
	

	public static void main(String[] args) {
		Address a1 = new Address("Pune", "Maharashtra", "India");
		Address a2 = new Address("Banglore", "Karnataka", "India");
		
		Employee2 e1 = new Employee2(1, "Rohan", a1);
		Employee2 e2 = new Employee2(2, "Ram", a2);
		
		e1.display();
		e2.display();

	}
	

}
