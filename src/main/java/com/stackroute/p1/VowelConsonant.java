package com.stackroute.p1;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class VowelConsonant {
    public static void main(String[] args) {										//main method
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();

        String result = checkVowelConsonant(word);									//method call

        System.out.println(result);
    }

    public static String checkVowelConsonant(String word){							//method body

        int len = word.length();

        String s = "";

        for ( int j =0; j<len ; j++) {										//loop to find if character or not
            if (!isLetter(word.charAt(j))) {
                return ("The input is not a letter");

            }
            if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                s= s.concat("Vowel ");															
            } else {
                s=s.concat("Consonant ");							//check vowel or consonant
            }
        }
        return s;
    }
}
