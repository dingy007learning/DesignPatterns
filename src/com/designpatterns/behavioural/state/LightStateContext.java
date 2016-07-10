package com.designpatterns.behavioural.state;

public class LightStateContext {

	private ILightState state = new OnState();
	
	public void setState(ILightState state) {
		this.state = state;
	}

	public ILightState getState() {
		return state;
	}
	
	public void pressButton() {
		this.getState().pressSwitch(this);
	}
}
