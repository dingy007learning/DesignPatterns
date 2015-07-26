package com.designpatterns.creational.factory;

public class PrintA5 implements Papers{

	@Override
	public void getPaperSize() {
		System.out.println("Printing in A5 size.");
	}

}
