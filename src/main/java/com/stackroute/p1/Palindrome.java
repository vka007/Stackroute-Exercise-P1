package com.stackroute.p1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n;

        System.out.println("Enter the Number");
        n = sc.nextLong();

        String result = checkPallindrome(n);

        System.out.println(result);
    }

    public static String checkPallindrome(long n)
    {
        if(n<0)
        {
            return "Invalid input.Enter positive number";       //check for invalid inputs
        }
        
        long test;
        int i = 0;
        double tot = 0;
        test = n;

        long arr1[] = new long[100];                        //long array created

        while (test != 0) {                                 //loop to reverse the integer 
            arr1[i] = test % 10;
            test = test / 10;
            i++;
        }

        for (int j=0; j< i-1; j++)                                      //loop to calculate the power 
        {
            tot = tot + (arr1[j] * (int)(Math.pow(10, i-j-1)));
        }

        tot = tot + arr1[i-1];                                      //calculate total 

        if ((int)tot == n)                                          //check for total and input number to determine pallindrome
        {
            tot = 0;

            for (int j = 0; j <= i-1; j+=2) {
                tot = tot + arr1[j];
            }

            if (tot >= 25.0) {                                  //check sum and return app. message
              //  tot = 0; i=0;
                return "The No is pallindrome and its sum of its digit is greater than 25";
            } else {
              //  tot = 0; i=0;
                return "The No is pallindrome and its sum of its digit is not greater than 25";
            }
        }
        else
        {
          //  tot = 0; i=0;
            return "The No is not pallindrome";
        }
    }
}
