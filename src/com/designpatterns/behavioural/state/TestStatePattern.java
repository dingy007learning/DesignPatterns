package com.designpatterns.behavioural.state;

public class TestStatePattern {
	
	public static void main(String[] args) {
		LightStateContext light = new LightStateContext();
		light.pressButton();
		light.pressButton();
		light.pressButton();
	}

}
