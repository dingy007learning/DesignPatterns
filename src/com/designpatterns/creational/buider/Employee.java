package com.designpatterns.creational.buider;

public class Employee {
	private final String fName; //Mandatory field
	private final String lName; //Mandatory field
	private final String address; // Optional field
	private final String designation; // Optional field
	
	public Employee(EmployeeBuilder employeeBuilder) {
		this.fName = employeeBuilder.getfName();
		this.lName = employeeBuilder.getlName();
		this.address = employeeBuilder.getAddress();
		this.designation = employeeBuilder.getDesignation();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append(", address=");
		builder.append(address);
		builder.append(", designation=");
		builder.append(designation);
		builder.append("]");
		return builder.toString();
	}
}
