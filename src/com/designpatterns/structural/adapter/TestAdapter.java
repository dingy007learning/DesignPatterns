package com.designpatterns.structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		AllImageVIewer imgViewer = new AllImageVIewer();
		imgViewer.viewImage("bmp", "BitmapImage");
		imgViewer.viewImage("jpeg", "JpegImage");
		imgViewer.viewImage("gif", "GIFImage");
		imgViewer.viewImage("abc", "InvalidFormat");
	}

}
