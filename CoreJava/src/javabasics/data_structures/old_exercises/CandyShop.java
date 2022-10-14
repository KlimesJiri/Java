package javabasics.data_structures.old_exercises;

import java.util.*;

public class CandyShop{
    public static void main(String... args){

        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Cupcake");
        list.add(2);
        list.add("Brownie");
        list.add(false);
        System.out.println(list);

        // Accidentally we added "2" and "false" to the `list`
        // Your task is to change the "2" to "Croissant" and change the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the `list` as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        System.out.println(repairSweetList(list));
    }

    static ArrayList<Object> repairSweetList(ArrayList<Object> inputList){
        for (int i = 0; i < inputList.size(); i++){
            if (inputList.get(i).equals(false)){
                inputList.remove(i);
                inputList.add(i,"Ice Cream");
            }
            if (inputList.get(i).equals(2)){
                inputList.remove(i);
                inputList.add(i ,"Croissant");
            }
        }
        return inputList;
    }
}