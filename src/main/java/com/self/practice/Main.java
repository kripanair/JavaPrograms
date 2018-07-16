package com.self.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by krinair on 12/07/18.
 */
public class Main {


	private final static String a = "Apples";
	private final static String b = "Banana";
	private final static String o = "Oranges";
	private final static String bp = "Banana peels";
	private final static String p = "Pears";

	private final static String text = "The giant panda has an insatiable appetite " +
			"for bamboo. A typical animal eats half the day—a " +
			"full 12 out of every 24 hours—and relieves itself " +
			"dozens of times a day. It takes 28 pounds of " +
			"bamboo to satisfy a giant panda's daily dietary " +
			"needs. Pandas will sometimes eat birds or rodents" +
			" as well.";

	String[] fruits = {a,b,o,bp,p};

	// How many sentences are there in this String
	private int getNumberOfSentences(String input){
		final String[] splittedStrings = input.split("[\\\\.\\\\]");

		return splittedStrings.length;
	}

	// Get character at specific index
	private static char getCharacter(String input, int index){
		final char expectedChar = input.charAt(index);

		return expectedChar;
	}

	// Print string if it contains substring
	private void containSubString(String main, String sub){
		if(main.contains(sub))
			System.out.println("String "+main+" contains substring "+sub);
	}

	// Print reverse string
	private String reverse(String input){
		String reverse ="";
		for (int i=input.length()-1;i>=0;i--){
			reverse=reverse+input.charAt(i);
		}
		return reverse;
	}

	// Get number of vowels and consonants in a String
	private void getCount(String input){
		int count = 0;
		for(int i=0;i<=input.length() -1;i++){
			String s = "[aeiou]|[AEIOU]" ;
			if(String.valueOf(input.charAt(i)).matches(s)){
				count++;
			}

		}
		System.out.println("Number of vowels is "+count +" AND the number of consonants is "+ String.valueOf(input.length() - count));

	}


	private void repeatedWords(String inputString){

		final String[] splittedString = inputString.split(" ");

		int count = 1;
		int max = 0;
		String mostRepeatedWord = "";
		HashMap<String ,Integer> mapOne = new HashMap<String, Integer>();
		for (String s: splittedString){
			if(mapOne.containsKey(s)){
				count ++;
				mapOne.put(s, count);
			}
			else{
				mapOne.put(s, count);
			}
		}
		System.out.println(mapOne.entrySet());

		for(String s: mapOne.keySet()){
			final Integer integer = mapOne.get(s);
			if(integer > max){
				mostRepeatedWord = s;
				max = integer;
			}

		}

		System.out.println("Most repeated word is: " + mostRepeatedWord + "= is repeated "+ max + " times");
	}

	public static void main(String[] args) {
		System.out.println(getCharacter(a,5));

		Main main = new Main();
		main.containSubString(bp, b);

		System.out.println(main.reverse(p));
		System.out.println(main.getNumberOfSentences(text));

		final String[] splitted = text.split(" ");
		System.out.println(splitted.length+ " words present");

		main.getCount("Is this a long string or a string with only literals and vowels");

		main.repeatedWords("Seashells is seashells without seashells in a sea full of shells in sea");

	}

}

