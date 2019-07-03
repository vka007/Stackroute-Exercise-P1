package com.stackroute.p1;
import java.util.Scanner;

public class IntegerCheck
{
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        String result = intCheck(n);

        System.out.println(result);
    }

    public static String intCheck(int n)
    {
        if(Character.isLetter(n))
            return "Invalid input.Enter integer";
        if(n%2 != 0 && n>=20 && n<=30)
        {
            return "Tom";
        }
        else if (n %2 == 0 && n>=20 && n<=30)
        {
            return "Jerry";
        }
        else
        {
            return "Invalid input.Enter integer\n";
        }
    }
}
