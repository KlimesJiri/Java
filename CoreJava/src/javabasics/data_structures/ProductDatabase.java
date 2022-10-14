package javabasics.data_structures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {

        //Create a map with the following key-value pairs:
        //Product name (key) 	Price (value)
        // Eggs              	200
        // Milk 	            200
        // Fish 	            400
        // Apples 	            150
        // Bread 	            50
        // Chicken 	            550
        Map<String, Integer> products = new HashMap<>(
                Map.of("Eggs",200, "Milk", 200,
                        "Fish", 400, "Apples", 150,
                        "Bread", 50, "Chicken", 550));

        //How much is the fish?
        System.out.println(products.get("Fish"));


        //What is the most expensive product?
        int highestPrice = 0;
        String mostExpensive = "";
        for (String s : products.keySet()){
            if (products.get(s) > highestPrice){
                highestPrice = products.get(s);
                mostExpensive = s;
            }
        }
        System.out.println(mostExpensive);


        //What is the average price?
        double sum = 0;
        for (String s : products.keySet()){
            sum += products.get(s);
        }
        System.out.println(sum/ products.size());


        //How many products' price is below 300?
        int productsUnder300 = 0;
        for (String s : products.keySet()){
            if (products.get(s) < 400){
                productsUnder300++;
            }
        }
        System.out.println(productsUnder300);


        //Is there anything we can buy for exactly 125?
        String price125 = "";
        for (String s : products.keySet()){
            if (products.get(s) == 125){
                price125 = s;
            }
        }
        if (price125.isEmpty()){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        //What is the cheapest product?
        int cheapestPrice = Integer.MAX_VALUE;
        String cheapest = "";
        for (String s : products.keySet()){
            if (products.get(s) < cheapestPrice){
                cheapestPrice = products.get(s);
                cheapest = s;
            }
        }
        System.out.println(cheapest);
    }
}
