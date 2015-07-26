package com.designpatterns.creational.Prototype;

public class Cow implements Prototypeable {

	@Override
	public Prototypeable clone() throws CloneNotSupportedException {
		System.out.println("Cloning a Cow.");
		return (Cow)super.clone();
	}

	@Override
	public String toString() {
			return "Cow";
	}

}
