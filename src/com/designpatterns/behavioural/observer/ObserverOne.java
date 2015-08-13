package com.designpatterns.behavioural.observer;

public class ObserverOne implements Observer {
	
	Subject subject;
	
	public ObserverOne(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	@Override
	public void update() {
		System.out.println("In ObserverOne:" + Integer.toBinaryString(subject.getState()));
	}

}
