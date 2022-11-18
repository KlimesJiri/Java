
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of miles that you want to convert to kilometers: ");
        double miles = scanner.nextDouble();
        double conversionRate = 1.609344;
        double kilometers = miles * conversionRate;
        System.out.println(miles + " mile(s) equals to " + kilometers + " kilometers.");

        scanner.close();
    }
}