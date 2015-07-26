package com.designpatterns.singleton.synch;

public class SingletonSynch {

	private static SingletonSynch instance;
	//IMP. always make the constructor private for Singleton implementation
	private SingletonSynch() {}

	public static  SingletonSynch getInstance() {
		if (instance == null) {
			synchronized (SingletonSynch.class) {
				if (instance == null) {
					instance = new SingletonSynch();
					System.out.println("Creating a new SingletonSynch Object.");
				}
			}
		}
		return instance;
	}
}
