package com.stackroute.p1;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class VowelConsonant {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();

        // char wordarr[]  = word.toCharArray();

        String result = checkVowelConsonant(word);

        System.out.println(result);
    }

    public static String checkVowelConsonant(String word){

        int len = word.length();

        String s = "";

        for ( int j =0; j<len ; j++) {
            if (!isLetter(word.charAt(j))) {
                return ("The input is not a letter");

            }
            if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                s= s.concat("Vowel ");
            } else {
                s=s.concat("Consonant ");
            }
        }
        return s;
    }
}