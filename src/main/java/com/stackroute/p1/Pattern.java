package com.stackroute.p1;
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {                                        //main method
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        String result = printPattern(n);                                            //method call 

        System.out.println(result);

    }
                
    public static String printPattern(int n){                                       //method body
    
        String s = "";



        for(int j=1; j<=n ; j++)                                                       //loop to generate pattern
        {
            for (int k = 1; k<=j; k++)
            {
                s=s.concat(j+" ");
            }
        }

        return s.trim();                                                            //return the pattern as string
    }
}
