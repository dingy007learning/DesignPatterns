package com.designpatterns.behavioural.observer;

public class ObserverTwo implements Observer {

	Subject subject;
	public ObserverTwo(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("In ObserverTwo: " + Integer.toHexString(subject.getState()));
	}

}
