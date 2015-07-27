package com.designpatterns.structural.adapter;

public class BitmapViewer implements ImageViewer {

	@Override
	public void viewImage(String imageType, String imageName) {
		System.out.println("BitmapViewer.viewImage() Viewing image: " + imageName + "; Of type: " + imageType);
	}

}
