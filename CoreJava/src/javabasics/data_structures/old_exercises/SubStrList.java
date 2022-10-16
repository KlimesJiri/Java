package javabasics.data_structures.old_exercises;

public class SubStrList {

    public static void main(String[] args) {

        //  Create a function that takes a string (`needle`) and a list of strings (`haystack`) as parameters
        //  and returns the index of the list element which contains the `needle` as a substring.
        //  You only need to find the first occurrence and return that index. The search should be case-sensitive!
        //  Return `-1` if none of the items in the list contain the `needle`.

        // Example

        String[] haystack = new String[] {"this", "is", "what", "I'm", "searching"};

        // Expected output: 4
        System.out.println(findIndex("ching", haystack));

        // Expected output: -1
        System.out.println(findIndex("not", haystack));
    }

    static int findIndex(String s, String[] sArr){
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].contains(s)){
                return i;
            }
        }
        return -1;
    }
}