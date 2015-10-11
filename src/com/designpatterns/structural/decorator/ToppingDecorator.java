package com.designpatterns.structural.decorator;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}
	public String getDesc() {
		return tempPizza.getDesc();
	}
	
	public double getCost() {
		return tempPizza.getCost();
	}
}
