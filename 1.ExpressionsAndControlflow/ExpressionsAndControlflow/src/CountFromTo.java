
import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2;

        while (true){
            number2 = scanner.nextInt();
            if (number1 < number2){
                break;
            }
            System.out.println("The second number should be bigger.");
        }

        System.out.println();

        while(number1 < number2){
            System.out.println(number1);
            number1++;
        }

        scanner.close();
    }
}
