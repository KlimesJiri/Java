package javabasics.expressions_and_controlflow;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int secondsInDay = 60 * 60 * 24;
        int currentTotalSeconds = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;

        int remainingSeconds = secondsInDay - currentTotalSeconds;
        System.out.println(remainingSeconds);
    }
}