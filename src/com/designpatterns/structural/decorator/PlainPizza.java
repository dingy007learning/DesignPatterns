package com.designpatterns.structural.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDesc() {
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		return 10.0;	
	}

}
