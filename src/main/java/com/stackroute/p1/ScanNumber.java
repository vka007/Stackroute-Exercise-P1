package com.stackroute.p1;
import java.util.Scanner;

public class ScanNumber {
    public static void main(String[] args) {
        int n, tot = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        int result = scanAndSum(n);

        System.out.println(result);
    }

    public static int scanAndSum(int n)
    {
        int tot =0;
        Scanner sc = new Scanner(System.in);
        while(n<=99999)
        {
            tot = tot+n;

            n = sc.nextInt();

        }

        return ((int)tot);
    }
}
