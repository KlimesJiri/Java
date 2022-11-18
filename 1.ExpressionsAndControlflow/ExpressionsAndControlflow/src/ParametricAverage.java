
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        int count;
        int sum = 0;
        int average = 0;

        System.out.println("How many numbers you wish to enter?");
        count = scanner.nextInt();
        System.out.println("You have chosen to enter " + count + " numbers.");

        System.out.println("Please enter " + count + "  integers:");
        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }
        average = sum / count;

        System.out.println("The sum of all numbers you have entered is: " + sum);
        System.out.println("And the average is: " + average);

        scanner.close();
    }
}
