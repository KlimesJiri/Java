package javabasics.expressions_and_controlflow;

public class IWontCheatOnTheExams {
    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"

        int countFrom = 1;
        int countTo = 100;
        while (countFrom <= countTo){
            System.out.println(countFrom);
            countFrom++;
        }
    }
}