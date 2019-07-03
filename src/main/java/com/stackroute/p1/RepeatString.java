package com.stackroute.p1;
import java.util.Scanner;

public class RepeatString{

    public static void main(String[] args) {                                            //main method
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and an integer: ");
        String input1 = sc.next();
        int input2 = sc.nextInt();

        String resultString = repeatString(input1, input2);                             //method call

        System.out.println(resultString);

    }

    public static String repeatString(String input1, int input2) {                          //method body

        String substr = input1.substring(input1.length()-input2);                           //substring find

        for(int i=1; i<=input2; i++) {                                                      //loop to traverse and add input by repeating

            input1=input1 + substr;
        }

        return input1;                                                                      //return result

    }

}