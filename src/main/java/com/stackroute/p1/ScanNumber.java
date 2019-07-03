package com.stackroute.p1;
import java.util.Scanner;

public class ScanNumber {
    public static void main(String[] args) {							//main method
        int n, tot = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        int result = scanAndSum(n);								//method call					

        System.out.println(result);
    }

    public static int scanAndSum(int n)								//method body
    {
        int tot =0;
        Scanner sc = new Scanner(System.in);
        while(n<=99999)										//condition to check range
        {
            tot = tot+n;

            n = sc.nextInt();

        }

        return ((int)tot);									//return the int value of tot, conversion
    }
}
