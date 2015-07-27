package com.designpatterns.structural.adapter;

public class AllImageVIewer implements ImageViewer {

	@Override
	public void viewImage(String imageType, String imageName) {
		if (imageType.equalsIgnoreCase("gif")) {
			System.out.println("AllImageVIewer.viewImage() Viewing Image : " + imageName + "; Of type : " + imageType);
		}
		else if (imageType.equalsIgnoreCase("bmp") || imageType.equalsIgnoreCase("jpeg")) {
			ImageViewerAdapter imgAdapter = new ImageViewerAdapter();
			imgAdapter.viewImage(imageType, imageName);
		}
		else {
			System.out.println("AllImageVIewer.viewImage() Unsupported File type.");
		}
	}

}
