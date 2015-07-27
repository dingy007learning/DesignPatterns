package com.designpatterns.creational.Prototype;

public class Cow implements Prototypeable {

	private String name;
	
	@Override
	public Prototypeable clone() throws CloneNotSupportedException {
		System.out.println("Cloning a Cow.");
		return (Cow)super.clone();
	}

	@Override
	public String toString() {
			return "Cow";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
