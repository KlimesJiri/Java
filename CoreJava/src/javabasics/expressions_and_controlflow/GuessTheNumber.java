package javabasics.expressions_and_controlflow;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int storedNumber = random.nextInt(50);
        //System.out.println(storedNumber);
        int guess;

        while(true){
            System.out.println("Try to guess the stored number:");
            guess = scanner.nextInt();
            if (guess == storedNumber){
                System.out.println("Your guess was correct! The number you were searching for was: " + storedNumber);
                break;
            } else if (guess < storedNumber){
                System.out.println("The number you are looking for is bigger, please guess again.");
            } else if (guess > storedNumber){
                System.out.println("The number you are looking for is smaller, please guess again.");
            }
        }
        scanner.close();
    }
}
