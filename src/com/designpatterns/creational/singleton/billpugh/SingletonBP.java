package com.designpatterns.creational.singleton.billpugh;

public class SingletonBP {

	//IMP. always make the constructor private for Singleton implementation
	private SingletonBP() {}
	
	private static class SingletonHelper{
		private static final SingletonBP INSTANCE = new SingletonBP();
	}
	
	public static SingletonBP getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
