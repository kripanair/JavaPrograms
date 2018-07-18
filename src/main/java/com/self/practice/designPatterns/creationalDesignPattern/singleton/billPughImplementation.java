package com.self.practice.designPatterns.creationalDesignPattern.singleton;

/**
 * Created by krinair on 17/07/18.
 */
public class billPughImplementation {

	// Private constructor to restrict intitilization
	private billPughImplementation(){}

	// creates an instance of the blass. Because of this "the instance" is created only when someone calls the getInstance method
	private static class SingletonHelper{
		private static final billPughImplementation instance = new billPughImplementation();
	}

	// Global access point which returns instance of this class -- using the private static class
	public static billPughImplementation getInstance(){
		return SingletonHelper.instance;
	}
}
