package com.self.practice.designPatterns.creationalDesignPattern.singleton;

import java.io.Serializable;

/**
 * Created by krinair on 17/07/18.
 */
public class serializable implements Serializable {
	private static final long serialID = 90909090L;

	// Private constructor to make sure only one instance is created
	private serializable(){}

	private static class serializableHelper {
		private static serializable instance = new serializable();
	}

	public static serializable getInstance(){
		return serializableHelper.instance;
	}
}
