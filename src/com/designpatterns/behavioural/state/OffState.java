package com.designpatterns.behavioural.state;

public class OffState implements ILightState {

	@Override
	public void pressSwitch(LightStateContext context) {
		if (context.getState() instanceof OnState) {
			System.out.println(String.format("Setting to State: %", this));
			context.setState(this);
		} else {
			context.setState(new OnState());
			System.out.println("Light is Off, changing to On State.");
		}
	}

	@Override
	public String toString() {
		return "OffState";
	}
}
