package javabasics.data_structures;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {

        //Represent the products with their prices:
        Map<String, Double> products = new HashMap<>(
                Map.of("Milk",1.07,
                        "Rice", 1.59,
                        "Eggs", 3.14,
                        "Cheese", 12.60,
                        "Chicken Breasts", 9.40,
                        "Apples", 2.31,
                        "Tomato", 2.58,
                        "Potato", 1.75,
                        "Onion", 1.10));

        //Represent Bob's shopping list:
        Map<String, Integer> bobsList = new HashMap<>(
                Map.of("Milk",3,
                        "Rice", 2,
                        "Eggs", 2,
                        "Cheese", 1,
                        "Chicken Breasts", 4,
                        "Apples", 1,
                        "Tomato", 2,
                        "Potato", 1));

        //Represent Alice's shopping list:
        Map<String, Integer> alicesList = new HashMap<>(
                Map.of("Rice", 1,
                        "Eggs", 5,
                        "Chicken Breasts", 2,
                        "Apples", 1,
                        "Tomato", 10)
        );

        //How much does Bob pay?
        double bobSum = 0;
        for (String s : bobsList.keySet()){
            for (String p : products.keySet()){
                if (p.equals(s))
                bobSum = bobSum + bobsList.get(s) * products.get(p);
            }
        }
        System.out.println(bobSum);

        //How much does Alice pay?
        double aliceSum = 0;
        for (String s : alicesList.keySet()){
            for (String p : products.keySet()){
                if (p.equals(s))
                    aliceSum = aliceSum + alicesList.get(s) * products.get(p);
            }
        }
        System.out.println(aliceSum);


//        String input = "Rice";
//        if (bobsList.get(input) > alicesList.get(input)){
//            System.out.println("Bob");
//        } else if (bobsList.get(input) < alicesList.get(input)){
//            System.out.println("Alice");
//        } else {
//            System.out.println("No one");
//        }

        //Who buys more Rice?
        whoBuysMore("Rice", bobsList, alicesList);

        //Who buys more Potato?
        whoBuysMore("Potato", bobsList, alicesList);

        //Who buys more Ham?
        whoBuysMore("Ham", bobsList, alicesList);

        //Who buys more Apples?
        whoBuysMore("Apples", bobsList, alicesList);

        //Who buys more of different products?
        if (bobsList.size() > alicesList.size()){
            System.out.println("Bob");
        } else if (bobsList.size() < alicesList.size()){
            System.out.println("Alice");
        } else {
            System.out.println("No one");
        }

        //Who buys more items? (more pieces)
        double bobProducts = 0;
        for (String s : bobsList.keySet()){
            bobProducts = bobProducts + bobsList.get(s);
        }
        double aliceProducts = 0;
        for (String s : alicesList.keySet()){
            aliceProducts = aliceProducts + alicesList.get(s);
        }
        if (bobProducts > aliceProducts){
            System.out.println("Bob");
        } else if (bobProducts < aliceProducts){
            System.out.println("Alice");
        } else {
            System.out.println("No one");
        }

    }


    static void whoBuysMore(String input, Map<String, Integer> bobsList, Map<String, Integer> alicesList){
        if (bobsList.containsKey(input) && alicesList.containsKey(input)){
            if (bobsList.get(input) > alicesList.get(input)){
                System.out.println("Bob");
            } else if (bobsList.get(input) < alicesList.get(input)){
                System.out.println("Alice");
            } else {
                System.out.println("No one");
            }
        } else if (bobsList.containsKey(input)){
            System.out.println("Bob");
        } else if (alicesList.containsKey(input)){
            System.out.println("Alice");
        } else {
            System.out.println("No one");
        }
    }
}
