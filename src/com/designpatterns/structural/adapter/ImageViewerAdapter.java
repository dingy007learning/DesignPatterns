package com.designpatterns.structural.adapter;

public class ImageViewerAdapter implements ImageViewer {

	
	@Override
	public void viewImage(String imageType, String imageName) {
		if (imageType.equalsIgnoreCase("bmp")){
			ImageViewer basicImgViewer = null;
			basicImgViewer = new BitmapViewer();
			basicImgViewer.viewImage(imageType, imageName);
		}
		else if (imageType.equalsIgnoreCase("jpeg")) {
			ImageViewer basicImgViewer = null;
			basicImgViewer = new JpegViewer();
			basicImgViewer.viewImage(imageType, imageName);
		}
		else {
			System.out.println("Unsupported file type.");
		}
	}

}
