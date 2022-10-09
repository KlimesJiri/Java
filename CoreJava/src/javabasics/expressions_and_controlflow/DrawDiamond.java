package javabasics.expressions_and_controlflow;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        int lines = 7;
        if (lines % 2 == 0){
            for (int i = 1; i <= lines / 2; i++) {
                for (int j = lines / 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = lines / 2; i > 0; i--) {
                for (int j = lines / 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= lines / 2 + 1; i++) {
                for (int j = lines / 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = lines / 2; i > 0; i--) {
                for (int j = lines / 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }




    }
}
