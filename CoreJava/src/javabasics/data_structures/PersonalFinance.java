package javabasics.data_structures;

import java.util.*;

public class PersonalFinance {
    public static void main(String[] args) {

        //Create a list with the following items:
        //    500, 1000, 1250, 175, 800 and 120
        List<Integer> finance = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        //Create an application which prints out the answers to the following questions:

        //How much did we spend?
        System.out.println("How much did we spend?");
        int sum = 0;
        for (Integer pays : finance){
            sum += pays;
        }
        System.out.println(sum);

        //Which was our greatest expense?
        System.out.println("Which was our greatest expense?");
//        int greatest = 0;
//        for (Integer pays : finance){
//           if (greatest < pays){
//               greatest = pays;
//           }
//        }
//        System.out.println(greatest);
        System.out.println(Collections.max(finance));

        //Which was our cheapest spending?
        System.out.println("Which was our cheapest spending?");
        System.out.println(Collections.min(finance));

        //What was the average amount of our spendings? (print this as a float value)
        System.out.println("What was the average amount of our spendings? (print as a float");
        float average = Float.valueOf(sum) / finance.size();
        System.out.println(average);

        //The full output of your main method should be the following:
        // 3845
        // 1250
        // 120
        // 640.8333
    }
}
