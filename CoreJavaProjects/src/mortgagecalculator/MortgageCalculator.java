import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    // This is a basic Mortgage calculator, the formula used to count mortgage was used from internet
    // It is basic little project, beware that it lacks validation for user inputs etc. that would ensure it works properly and doesn't crash

    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double numerator = (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments));

        double denominator = (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        double mortgage = principal * numerator / denominator;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}