package com.designpatterns.behavioural.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer observerone = new ObserverOne(subject);
		Observer observertwo = new ObserverTwo(subject);
		
		subject.setState(15);
	}

}
