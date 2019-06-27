package com.stackroute.p1;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        // write your code here

        guessTheNumber();

    }

    public static void guessTheNumber() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int yourGuess;
        do {
            System.out.println("Guess a number from 1-100");
            yourGuess = sc.nextInt();
            if(yourGuess>randomNumber){
                System.out.println("Number guessed is more than original number");
            }

            else if(yourGuess<randomNumber){
                System.out.println("Number guessed is less than original number");
            }

            else {

                System.out.println("Number guessed matches the original number");

            }


        }while(yourGuess!=randomNumber);

    }
}
