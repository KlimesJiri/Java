package javabasics.arrays;

import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};
        int placeholder;

        for (int i = 0; i < numbers.length; i++) {
            placeholder = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = placeholder;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
