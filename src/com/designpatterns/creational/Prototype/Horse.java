package com.designpatterns.creational.Prototype;

public class Horse implements Prototypeable {

	@Override
	public Prototypeable clone() throws CloneNotSupportedException {
		System.out.println("Cloning a Horse.");
		return (Horse)super.clone();
	}
	
	public String toString() {
		return "Horse";
	}

}
