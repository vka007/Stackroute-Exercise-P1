package com.stackroute.p1;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        String revString = stringReverse(str);
        System.out.println(revString);
    }

    public static String stringReverse(String str) {

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }
}
