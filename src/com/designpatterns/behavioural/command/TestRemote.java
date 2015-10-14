package com.designpatterns.behavioural.command;

public class TestRemote {
	public static void main(String[] args) {
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
	}
	
	
	
}
