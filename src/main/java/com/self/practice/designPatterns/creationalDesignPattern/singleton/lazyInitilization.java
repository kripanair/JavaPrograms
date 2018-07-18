package com.self.practice.designPatterns.creationalDesignPattern.singleton;

/**
 * Created by krinair on 17/07/18.
 */
public class lazyInitilization {

	// Private member that is the only instance of the class
	private static lazyInitilization instance;

	// Private constructor to restrict intitilization
	private lazyInitilization(){}

	// Global access point which returns instance of this class
	public static lazyInitilization getInstance(){
		// In case of multi-threaded application multiple versions will be available
		if(instance == null){
			instance = new lazyInitilization();
		}

		return instance;
	}
}
