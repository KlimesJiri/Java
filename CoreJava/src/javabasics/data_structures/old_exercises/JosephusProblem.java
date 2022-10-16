package javabasics.data_structures.old_exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {

        // "Please enter the number of players:"
        // > numberOfPlayers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players: ");
        int numberOfPlayers = scanner.nextInt();

        System.out.println(String.format(
                "The winning seat is %d", getWinningSeat(numberOfPlayers)
        ));
    }

    private static int getWinningSeat(int input){
        return 0;
    }
}