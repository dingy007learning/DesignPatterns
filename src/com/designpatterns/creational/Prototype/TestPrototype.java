package com.designpatterns.creational.Prototype;

public class TestPrototype {

	public static void main(String[] args) {
			Cow cow1 = new Cow();
			Cow cow2 = null;
			
			cow1.setName("Cow1");
			System.out.println("Cow1 created.");
			try {
				System.out.println("Initiating cloning sequence");
				cow2 = (Cow) cow1.clone();
				System.out.println("Completed cloning");
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			cow2.setName("Cow2");
			System.out.println("Cow1 name: " + cow1.getName());
			System.out.println("Cow2 name: " + cow2.getName());
			System.out.println("Changing the name of Cow2 does not affect name of Cow1.");
	}

}
