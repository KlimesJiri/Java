import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys
        //
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
        //
        // If there are less people coming than 20
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many girls will be at the party: ");
        int girls = scanner.nextInt();
        System.out.println("Enter how many boys will be at the party: ");
        int boys = scanner.nextInt();

        if (girls == boys && girls + boys > 20){
            System.out.println("This party is excellent!!!");
        } else if (girls != boys && girls + boys > 20 && girls != 0){
            System.out.println("Quite a cool party!");
        } else if (girls + boys < 20 && girls != 0){
            System.out.println("Average party.");
        } else if (girls == 0) {
            System.out.println("Sausage party.");
        }

        scanner.close();
    }
}