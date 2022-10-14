package javabasics.data_structures;

import java.util.*;

public class PersonalFinance {
    public static void main(String[] args) {

        List<Integer> finance = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));


        System.out.println("How much did we spend?");
        int sum = 0;
        for (Integer pays : finance){
            sum += pays;
        }
        System.out.println(sum);


        System.out.println("Which was our greatest expense?");
//        int greatest = 0;
//        for (Integer pays : finance){
//           if (greatest < pays){
//               greatest = pays;
//           }
//        }
//        System.out.println(greatest);
        System.out.println(Collections.max(finance));


        System.out.println("Which was our cheapest spending?");
        System.out.println(Collections.min(finance));


        System.out.println("What was the average amount of our spendings? (print as a float");
        float average = Float.valueOf(sum) / finance.size();
        System.out.println(average);

    }
}
