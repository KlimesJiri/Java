package arrays;

public class Matrix {
    public static void main(String[] args) {
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output

        int[][] matrix = new int[4][4];
        int size = 16;

        for (int i = 0; i < size / 4; i++) {
            for (int j = 0; j < size / 4; j++) {
                if (i == j){
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
