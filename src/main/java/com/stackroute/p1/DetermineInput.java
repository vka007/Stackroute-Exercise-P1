package com.stackroute.p1;
import java.util.Scanner;

public class DetermineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter");
        char c = sc.next().charAt(0);

        String Result = determineInput(c);

        System.out.println(Result);

    }

    public static String determineInput(char c)                             //method body start
    {
        if(c >='a' && c<= 'z')                                              //check for different type of inputs
        {
            return (c+" is a small letter");
        }
        else if (c>='A' && c<='Z')
        {
            return (c+" is a capital letter");
        }
        else if( c >= '0' && c<='9')
        {
            return (c+" is a digit");
        }
        else
        {
            return (c+" is a symbol");
        }
    }
}
