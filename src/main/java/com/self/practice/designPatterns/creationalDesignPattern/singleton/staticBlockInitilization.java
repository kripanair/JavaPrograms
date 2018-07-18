package com.self.practice.designPatterns.creationalDesignPattern.singleton;

/**
 * Created by krinair on 17/07/18.
 */
public class staticBlockInitilization {

	// Private variable which is the only instance of the class
	private static staticBlockInitilization instance;

	// Private constructor to restrict intitilization
	private staticBlockInitilization(){}

	// Static block initilization for exception handling
	static {
		try{
			instance = new staticBlockInitilization();
		} catch (Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	// Global access point to get instance of singleton class
	public static staticBlockInitilization getInstance(){
		return  instance;
	}
}
