package com.designpatterns.creational.buider;

public class TestBuilder {

	public static void main(String[] args) {
		Employee emp1 = new EmployeeBuilder("Raj", "Kumar")
			.address("Addres for Emp1")
			.designation("Actor")
			.build(); // Creates the User object
		
		Employee emp2 = new EmployeeBuilder("Sharath", "Kumar")
		.address("Address for Emp2")
		.build();
		
		Employee emp3 = new EmployeeBuilder("Vijay", "Kanth")
		.build();
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
