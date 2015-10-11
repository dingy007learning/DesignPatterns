package com.designpatterns.structural.decorator;

public class PlainPizza implements Pizza {

	public PlainPizza() {
		super();
		System.out.println("Adding Dough");
	}
	
	@Override
	public String getDesc() {
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		return 10.0;	
	}

}
