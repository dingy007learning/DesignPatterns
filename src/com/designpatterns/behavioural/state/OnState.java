package com.designpatterns.behavioural.state;

public class OnState implements ILightState {

	@Override
	public void pressSwitch(LightStateContext context) {
		
		if (context.getState() instanceof OnState) {
			System.out.println("Light is ON, changing to Off State.");
			context.setState(new OffState());
		} else {
			System.out.println("Changing Light to Off.");
			context.setState(this);
		}
	}

	@Override
	public String toString() {
		return "OnState";
	}

}
