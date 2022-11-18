package old_exercises;

import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {

        // "Please enter the number of players:"
        // > numberOfPlayers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players: ");
        int numberOfPlayers = scanner.nextInt();

        while (true){
            if (numberOfPlayers <= 0){
                System.out.println("Please enter number bigger than 0");
                numberOfPlayers = scanner.nextInt();
            } else {
                break;
            }
        }

        System.out.println(String.format(
                "The winning seat in Josephus problem is %d", getWinningSeat(numberOfPlayers)
        ));
    }

    private static int getWinningSeat(int input){
        List<Integer> isAlive = new ArrayList<>();
        // Add all prisoners
        // Each prisoner is represented by his number(Integer) in the sequence
        for (int i = 1; i <= input; i++) {
            isAlive.add(i);
        }
        while (true){
            if (isAlive.size() == 1){
                break;
            }
            for (int i = 0; i < isAlive.size(); i++) {
                if (isAlive.size() == 1){
                    break;
                } else if (i == isAlive.size() - 1){
                    isAlive.remove(0);
                }
                else {
                    isAlive.remove(i+1);
                }
            }
        }
        return isAlive.get(0);
    }
}