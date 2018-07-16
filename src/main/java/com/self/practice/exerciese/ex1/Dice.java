package com.self.practice.exerciese.ex1;

/**
 * Created by krinair on 12/07/18.
 */

import java.util.Random;

public class Dice {
	static int sidesOfDice = 6;
	int faceValue = 0;

	public int roll() {
		Random rand = new Random();
		this.faceValue = rand.nextInt(sidesOfDice) + 1;
		return this.faceValue;
	}

	public static void changeNumSidesOfDice(int newNumberOfSides) {
		Dice.sidesOfDice = newNumberOfSides;
	}

	public int getFaceValue() {
		return this.faceValue;
	}

}

