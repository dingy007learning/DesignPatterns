package com.designpatterns.creational.factory;

public class TestPrintingFactory {

	public static void main(String[] args) {
		PrintingFactory printingFactory = new PrintingFactory();
		Papers papers = null;
		papers = printingFactory.getPrintouts(PaperSizeRange.LARGE);
		papers.getPaperSize();
		papers = printingFactory.getPrintouts(PaperSizeRange.SMALL);
		papers.getPaperSize();
		papers = printingFactory.getPrintouts(PaperSizeRange.MEDIUM);
		papers.getPaperSize();
	}

}
