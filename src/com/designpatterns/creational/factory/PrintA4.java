package com.designpatterns.creational.factory;

public class PrintA4 implements Papers{

	@Override
	public void getPaperSize() {
		System.out.println("Printing in A4 size.");
	}
	
}
