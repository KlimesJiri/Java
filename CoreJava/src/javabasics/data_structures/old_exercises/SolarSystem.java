package javabasics.data_structures.old_exercises;

import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        List<String> planetList = Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune");

        // "Saturn" is missing from the planetList
        // Insert it into the correct position
        // Create a method called "putSaturn()" which has a list parameter and returns
        // the list of planets in the correct order

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
        System.out.println(putSaturn(planetList));

    }

    static List<String> putSaturn(List<String> list){
        List<String> returnList = new ArrayList<>(list);
        returnList.add( 5,"Saturn");
        return returnList;
    }
}