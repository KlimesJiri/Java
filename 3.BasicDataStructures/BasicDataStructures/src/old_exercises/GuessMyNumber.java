package old_exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        randomNumber(scanner, random);

        randomNumberRange(scanner, random, 4);

        randomNumberRangeLives(scanner, random, 10);

        scanner.close();
    }

    private static void randomNumber(Scanner scanner, Random random){
        int number = random.nextInt(1,101);

        System.out.println("Please enter your guess, for the number in between 1 and 100, or 0 to end the game.");

        int guess = scanner.nextInt();

        while(true){
            System.out.println();
            if (guess == number){
                System.out.println("Congratulations. The number was: " + number + ". You've won!");
                break;
            } else if(guess == 0) {
                System.out.println("You have decided to end the game. The number you were searching for was: " + number);
                break;
            } else if(guess > number){
                System.out.println("Too high.");
            } else if(guess < number){
                System.out.println("Too low.");
            }
            System.out.println("Try again:");
            guess = scanner.nextInt();
        }

        return;
    }

    private static void randomNumberRange(Scanner scanner, Random random, int max){
        int number = random.nextInt(1,max);

        System.out.println("Please enter your guess, for the number in between 1 and " + max + ", or 0 to end the game.");
        int guess = scanner.nextInt();

        while(true){
            System.out.println();
            if (guess == number){
                System.out.println("Congratulations. The number was: " + number + ". You've won!");
                break;
            } else if(guess == 0) {
                System.out.println("You have decided to end the game. The number you were searching for was: " + number);
                break;
            } else if(guess > number){
                System.out.print("Too high.");
            } else if(guess < number){
                System.out.print("Too low.");
            }
            System.out.println("Try again:");
            guess = scanner.nextInt();
        }
        return;
    }

    private static void randomNumberRangeLives(Scanner scanner, Random random, int max){
        int number = random.nextInt(1,max);
        int lives = 10;

        System.out.println("You have " + lives + " lives/guesses!\nPlease enter your guess, for the number in between 1 and " + max + ", or 0 to end the game.");
        int guess = scanner.nextInt();

        System.out.println();

        while(true){
            System.out.println();
            if (guess == number){
                System.out.println("Congratulations. The number was: " + number + ". You've won!");
                break;
            } else if(guess == 0) {
                System.out.println("You have decided to end the game. The number you were searching for was: " + number);
                break;
            } else if(guess > number){
                lives--;
                System.out.print("Too high. You have " + lives + " left.");
            } else if(guess < number){
                lives--;
                System.out.print("Too low. You have " + lives + " left.");
            }
            System.out.println("Try again:");
            guess = scanner.nextInt();
        }
        return;
    }
}
