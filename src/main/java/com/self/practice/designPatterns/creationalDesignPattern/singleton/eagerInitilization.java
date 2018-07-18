package com.self.practice.designPatterns.creationalDesignPattern.singleton;

/**
 * Created by krinair on 17/07/18.
 */
public class eagerInitilization {

	// Private Variable that is the only instance of the class
	private static final eagerInitilization instance = new eagerInitilization();

	// Private constructor to restrict intitilization
	private eagerInitilization() {}

	// Global access point which returns instance of this class
	public static eagerInitilization getInstance(){
		return instance;
	}
}
