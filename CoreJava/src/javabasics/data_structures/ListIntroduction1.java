package javabasics.data_structures;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        List<String> names = new ArrayList<>();

        //Print out the number of elements in the list
        System.out.println(names.size());

        //Add "William" to the list
        names.add("William");

        //Print out whether the list is empty or not
        System.out.println(names.isEmpty());

        //Add "John" to the list
        //Add "Amanda" to the list
        names.add("John");
        names.add("Amanda");

        //Print out the number of elements in the list
        System.out.println(names.size());

        //Print out the 3rd element
        System.out.println(names.get(2));

        //Iterate through the list and print out each name
        for (String name: names) {
            System.out.println(name);
        }

        //Iterate through the list and print
        for (String name: names) {
            System.out.println(names.indexOf(name) + 1 + ". " + name);
        }

        //Remove the 2nd element
        names.remove(1);

        //Iterate through the list in a reversed order and print out each name
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(names.size() - 1 - i));
        }

        //Remove all elements
        names.removeAll(names);

        //Print out the number of elements in the list
        System.out.println(names.size());

        //The full output of your main method should be the following:
        // 0
        // false
        // 3
        // Amanda
        // William
        // John
        // Amanda
        // 1. William
        // 2. John
        // 3. Amanda
        // Amanda
        // William
        // 0
    }
}
