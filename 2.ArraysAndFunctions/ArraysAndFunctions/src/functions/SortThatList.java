package functions;

import java.util.Arrays;

public class SortThatList {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending


        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        //  Example:
        System.out.println(Arrays.toString(trueBubble(new int[] {34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(trueBubbleAdvanced(new int[] {34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    public static int[] bubble(int[] numArr){
        Arrays.sort(numArr);
        return numArr;
    }

    public static int[] trueBubble(int[] numArr){
        int swap;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]){
                    swap = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = swap;
                }
            }
        }
        return numArr;
    }

    public static int[] trueBubbleAdvanced(int[] numArr, boolean bool){
        int swap;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (bool){
                    if (numArr[i] > numArr[j]){
                        swap = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = swap;
                    }
                } else {
                    if (numArr[i] < numArr[j]){
                        swap = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = swap;
                    }
                }
            }
        }
        return numArr;
    }
}
