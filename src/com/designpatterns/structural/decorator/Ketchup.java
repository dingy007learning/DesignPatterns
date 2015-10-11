package com.designpatterns.structural.decorator;

public class Ketchup extends ToppingDecorator {

	public Ketchup(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding ketchup...");
	}
	public String getDesc() {
		return tempPizza.getDesc() + ", Ketchup";
	}

	public double getCost() {
		return tempPizza.getCost() + 0.30;
	}
}
