
import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {
        int lineCount = 6;
        // Write a program that draws a square like this:
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as lineCount is
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            System.out.print("%");
        }
        System.out.println();
        for (int i = 1; i < lines - 1; i++) {
            for (int j = 0; j < lines; j++) {
                if (j == 0 || j == lines - 1){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < lines; i++) {
            System.out.print("%");
        }
        scanner.close();
    }
}
