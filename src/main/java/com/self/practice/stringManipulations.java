package com.self.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by krinair on 27/06/18.
 */
public class stringManipulations {
    final static String someVariable = "some Value";

    public static void main(String[] args) throws IOException {
        final int lengthOfString = someVariable.length();

        String stringOriginal = "abc123de56";


        File fileName = new File("");
        FileWriter fw = new FileWriter(fileName);
        fw.write(stringOriginal);
        fw.close();
        additionOfNumbersInStringInput(stringOriginal);

        isAnagram("dormitory", "dirty room");

        isAnagram("rat", "tar");

        isArmStrongNumber(371);

        isArmStrongNumber(90);

        final String returnedString = reverseString("something");
        System.out.println(returnedString);

        checkPalindrome("malayalam");
        checkPalindrome("hindi");

        final String replacedString = replaceStringWithString("Kripa", 'i', 'p');
        System.out.println(replacedString);

        final boolean value = checkDigitPresent("Kripa007");
        System.out.println(value);

        getOccurence("Mississsippi");
        someMethod();


    }


    private static void someMethod(){

    }
    private static void additionOfNumbersInStringInput(String stringOriginal) {
        int sum = 0;

        // Get individual numbers
        String[] splittedString = stringOriginal.split("[a-zA-Z]+");

        // Perform addition
        for (int i = 0; i <= splittedString.length - 1; i++) {

            if (!splittedString[i].equals("")) {
                int converted = Integer.parseInt(splittedString[i]);
                sum = converted + sum;
            }
        }

        // Sum of numbers is:
        System.out.println(sum);
    }
    private static boolean isAnagram(String one, String two) {
        boolean result;

        String replacedStringOne = one.replaceAll("\\s", "");
        String replacedStringTwo = two.replaceAll("\\s", "");
        if (replacedStringOne.length() != replacedStringTwo.length()) {
            System.out.println("Strings " + one + " " + two + " are not anagram");
            result = false;
        } else {
            char[] charsOne = replacedStringOne.toCharArray();
            char[] charsTwo = replacedStringTwo.toCharArray();

            Arrays.sort(charsOne);
            Arrays.sort(charsTwo);

            if (Arrays.equals(charsOne, charsTwo)) {
                result = true;
            } else
                result = false;
        }


        System.out.println(result);
        return result;
    }
    // Need to change this properly
    private static boolean isArmStrongNumber(int number) {
        int result = 0;
        int remainder;
        int temp = number;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            result = result + (remainder * remainder * remainder);
        }

        return temp == result;
    }
    // String reversal
    private static String reverseString(String someString){
        String reverse = "";
        for(int i=someString.length()-1; i>= 0;i--){
            reverse = reverse + (String.valueOf(someString.charAt(i)));

        }
        return reverse;
    }
    // Palindrome
    private static boolean checkPalindrome(String input){
        final String changedString = reverseString(input);

        if(changedString.equals(input)){
            System.out.println("Is Palindrome");
            return true;
        }
        else
            System.out.println("Not Palindrome");
            return false;
    }
    // Replace all d with f in a given string
    private static String replaceStringWithString(String inputString, Character original, Character toBeReplaced){
        String replacedString = null;
        for (int i=0;i<=inputString.length() - 1;i++){
            if(inputString.charAt(i) == original){
                  replacedString = inputString.replace(original, toBeReplaced);
            }
        }
        return replacedString;
    }
    // Check if String contains digit
    private static boolean checkDigitPresent(String input){
        Pattern pat = Pattern.compile("\\d");
        Matcher mat = pat.matcher(input);

        return mat.find();
    }
    // Return highest occurrence of character in a string
    private static String getOccurence(String inputString){
        int count =0;

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //get hashmap of
        for(int i=0;i<=inputString.length() -1; i++){

           if(map.containsValue(String.valueOf(inputString.charAt(i)))){
               count = count +1;
               map.put(count,String.valueOf(inputString.charAt(i)));
           }
           else
               map.put(count, String.valueOf(inputString.charAt(i)));
        }

        Set newHashSet = map.keySet();
        List sorted = new ArrayList(newHashSet);
        Collections.sort(sorted);

        final Object first = sorted.get(0);

        final String s = map.get(first);
        System.out.println("The Character "+s+ " is repeated");
        return s;
    }
    // Fibonacci series
    // factorial
    // print tree structure



}

