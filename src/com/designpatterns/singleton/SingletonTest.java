package com.designpatterns.singleton;

import com.designpatterns.singleton.billpugh.SingletonBP;
import com.designpatterns.singleton.synch.SingletonSynch;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonBP.getInstance();
		SingletonBP.getInstance();
		
		SingletonSynch.getInstance();
		SingletonSynch.getInstance();
	}

}
