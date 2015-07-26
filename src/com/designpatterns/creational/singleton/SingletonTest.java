package com.designpatterns.creational.singleton;

import com.designpatterns.creational.singleton.billpugh.SingletonBP;
import com.designpatterns.creational.singleton.synch.SingletonSynch;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonBP.getInstance();
		SingletonBP.getInstance();
		
		SingletonSynch.getInstance();
		SingletonSynch.getInstance();
	}

}
