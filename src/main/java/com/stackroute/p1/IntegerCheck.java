package com.stackroute.p1;
import java.util.Scanner;

public class IntegerCheck
{
    public static void main(String[] args) {                                    //main method
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        String result = intCheck(n);                                            //method call

        System.out.println(result);
    }

    public static String intCheck(int n)                                        //method body
    {
        if(Character.isLetter(n))                                              //check if it is character
            return "Invalid input.Enter integer";
        if(n%2 != 0 && n>=20 && n<=30)                                          //check for range
        {
            return "Tom";
        }
        else if (n %2 == 0 && n>=20 && n<=30)
        {
            return "Jerry";
        }
        else
        {
            return "Invalid input.Enter integer\n";                            //return messages accordingly
        }
    }
}
