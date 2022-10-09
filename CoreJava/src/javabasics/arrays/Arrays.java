package javabasics.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6};

        // Print the second element of the array
        System.out.println("The second element is " + numbers[1]);

        // Print all elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}