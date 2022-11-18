
public class DrawPyramid {
    public static void main(String[] args) {

        int lineCount = 4;
        // Write a program that draws a pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        int lines = 6;

        for (int i = 0; i <= lines; i++) {
            for (int j = lines; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
