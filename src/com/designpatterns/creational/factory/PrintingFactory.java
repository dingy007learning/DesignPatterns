package com.designpatterns.creational.factory;


public class PrintingFactory {
	
	public Papers getPrintouts(PaperSizeRange paperSize) {
		Papers papers = null;
		switch (paperSize) {
			case SMALL : 
				papers = new PrintA5();
				break;
			case MEDIUM :
				papers = new PrintA4();
				break;
			case LARGE :
				papers = new PrintB3();
				break;
		}
		return papers;
		
	}

}
