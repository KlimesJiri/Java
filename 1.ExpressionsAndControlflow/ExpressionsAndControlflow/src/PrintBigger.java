
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int bigger = number1 > number2 ? number1 : number2;
        System.out.println("The bigger number is " + bigger);

        scanner.close();
    }
}