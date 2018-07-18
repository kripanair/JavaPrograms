package com.self.practice.designPatterns.creationalDesignPattern.singleton;

/**
 * Created by krinair on 17/07/18.
 */
public class threadSafe {

	// Private member that is the only instance of the class
	private static threadSafe instance;

	// Private constructor to restrict intitilization
	private threadSafe(){}

	// Global access point which returns instance of this class --- this code is costly fo see below code
	public static synchronized threadSafe getInstance(){
		if(instance == null){
			instance = new threadSafe();
		}

		return instance;
	}

	// Cost effective "Thread Safe" singleton class
	public static threadSafe getInstanceDoubleLocking(){
		if(instance == null){
			synchronized (threadSafe.class){
				if(instance == null) {
					instance = new threadSafe();
				}
			}
		}

		return instance;
	}
}
