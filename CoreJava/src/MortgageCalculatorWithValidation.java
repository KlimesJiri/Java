import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorWithValidation {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        int principal;
        float monthlyInterest;
        int numberOfPayments;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Principal\n(Value between 1,000 and 1,000,000)\nValue: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000:");
        }

        while (true){
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true){
            System.out.println("Period (Years): ");
            int years = scanner.nextInt();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double numerator = (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments));
        double denominator = (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        double mortgage = principal * numerator / denominator;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
