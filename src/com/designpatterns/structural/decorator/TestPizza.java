package com.designpatterns.structural.decorator;

public class TestPizza {

	public static void main(String[] args) {
		Pizza mozzwKetchupPizza = new Ketchup(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + mozzwKetchupPizza.getDesc());
		System.out.println("Cost: $" + mozzwKetchupPizza.getCost());
	}
}
