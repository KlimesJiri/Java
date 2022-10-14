package javabasics.functions;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
        System.out.println(Arrays.toString(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34, 1, 1, 15, 15, 15, 15, 15, 15})));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] findUniqueItems(int[] arr){
        int[] result = new int[0];

        // First sort the array so that
        // all occurrences become consecutive
        Arrays.sort(arr);

        // Traverse the sorted array
        for (int i = 0; i < arr.length; i++)
        {
            // Move the index ahead while
            // there are duplicates
            while (i < arr.length - 1 && arr[i] == arr[i + 1]){
                i++;
            }

            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = arr[i];
        }
        return result;
    }
}
