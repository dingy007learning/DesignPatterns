package com.designpatterns.creational.Prototype;

public class Goat implements Prototypeable {

	@Override
	public Goat clone() throws CloneNotSupportedException {
		System.out.println("Cloning a goat!");
		return (Goat) super.clone();
	}
	
	public String toString() {
		return "Goat";
	}

}
