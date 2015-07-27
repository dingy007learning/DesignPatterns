package com.designpatterns.creational.buider;

public class EmployeeBuilder {
	private final String fName;
	private final String lName;
	private String address;
	private String designation;
	
	public EmployeeBuilder(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	public EmployeeBuilder address(String address) {
		this.address = address;
		return this;
	}
	public EmployeeBuilder designation(String designation) {
		this.designation = designation;
		return this;
	}
	public Employee build() {
		Employee employee = new Employee(this);
		return employee;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	
}
