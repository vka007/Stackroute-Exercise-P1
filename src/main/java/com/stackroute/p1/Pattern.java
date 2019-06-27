package com.stackroute.p1;
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        String result = printPattern(n);

        System.out.println(result);

    }

    public static String printPattern(int n){

        String s = "";

        for(int j=1; j<=n ; j++)
        {
            for (int k = 1; k<=j; k++)
            {
                s=s.concat(j+" ");
            }
        }

        return s.trim();
    }
}
