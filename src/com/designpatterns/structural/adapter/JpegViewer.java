package com.designpatterns.structural.adapter;

public class JpegViewer implements ImageViewer {

	@Override
	public void viewImage(String imageType, String imageName) {
		System.out.println("JpegViewer.viewImage() Viewing Image: " + imageName + "; Of type: " + imageType);
	}

}
