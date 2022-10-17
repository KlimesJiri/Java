package javabasics.data_structures.old_exercises;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // "Please enter a number to check:
        // > number
        int number = 153;

        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }
    }


    private static boolean isArmstrongNumber(int input){
        List<Integer> digits = new ArrayList<>();
        int sum = 0;
        int digit = input;
        while (digit > 0){
            digits.add(digit % 10);
            digit /= 10;
        }
        for (int i = 0; i < digits.size(); i++) {
            sum += (int) Math.pow(digits.get(i), digits.size());
        }
        if (sum == input){
            return true;
        }
        return false;
    }
}