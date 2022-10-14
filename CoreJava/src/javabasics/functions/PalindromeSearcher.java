package javabasics.functions;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {

    public static void main(String[] args) {
        String tested = "dog";
        searchPalindrome(tested);
    }

    public static void searchPalindrome(String tested) {
        if (tested.length() < 3){
            System.out.println("We are searching for palindromes from words, that are at least 3 characters long.");
            return;
        }

        // odd length palindromes:
        //started i at 1 so the j can start at 0
        for (int i = 1; i < tested.length()-1; i++) {
            for (int j = i - 1, k = i + 1; j >= 0 && k < tested.length(); j--, k++) {
                //testing if returned characters of the string are the same
                if (tested.charAt(j) == tested.charAt(k)) {
                    //testing if the palindrome will have at least 3 char
                    if (k - j + 1 >= 3)
                        System.out.println(tested.substring(j, k + 1));
                } else
                    break;
            }
        }
        // even length palindromes
        for (int i = 1; i < tested.length()-1; i++) {
            for (int j = i, k = i + 1; j >= 0 && k < tested.length(); j--, k++) {
                if (tested.charAt(j) == tested.charAt(k)) {
                    if (k - j + 1 >= 3)
                        System.out.println(tested.substring(j, k + 1));
                } else
                    break;
            }
        }
    }
}