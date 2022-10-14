package javabasics.data_structures;

import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {

        //Create an empty map where the keys are integers and the values are characters
        Map<Integer, String> map = new HashMap<>();

        //Print out whether the map is empty or not
        System.out.println(map.isEmpty());

        //Add the following key-value pairs to the map
        //Key 	Value
        //97 	a
        //98 	b
        //99 	c
        //65 	A
        //66 	B
        //67 	C
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        //Print all the keys
        System.out.println(map.keySet());

        //Print all the values
        System.out.println(map.values());

        //Add value D with the key 68
        map.put(68, "D");

        //Print how many key-value pairs are in the map
        System.out.println(map.size());

        //Print the value that is associated with key 99
        System.out.println(map.get(99));

        //Remove the key-value pair with key 97 and print the associated value
        map.remove(97);

        //Print whether there is an associated value with key 100 or not
        System.out.println(map.containsKey(100));

        //Remove all the key-value pairs
        map.clear();

        //Print how many key-value pairs are in the map
        System.out.println(map.size());

        //The full output of your main method should be the following:
        // true
        // [97, 65, 98, 66, 99, 67]
        // [a, A, b, B, c, C]
        // 7
        // c
        // false
        // 0

    }
}
