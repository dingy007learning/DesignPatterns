package com.designpatterns.structural.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Mozzarella...");
	}
	
	public String getDesc() {
		return tempPizza.getDesc() + ", Mozzarella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.50;
	}

}
