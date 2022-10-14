package javabasics.data_structures.old_exercises;

import java.util.*;

public class Matchmaking{
    public static void main(String... args){

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }

    static List<String> match(List<String> girls, List<String> boys){
        List<String> matchList = new ArrayList<>();

        if (boys.size() == girls.size()){
            for (int i = 0; i < boys.size(); i++) {
                matchList.add(girls.get(i) + "-" + boys.get(i));
            }
        } else if (boys.size() > girls.size()){
            for (int i = 0; i < boys.size(); i++) {
                if (girls.size() > i){
                    matchList.add(girls.get(i) + "-" + boys.get(i));
                } else {
                    matchList.add(boys.get(i));
                }
            }
        } else if (boys.size() < girls.size()){
            for (int i = 0; i < girls.size(); i++) {
                if (boys.size() > i){
                    matchList.add(girls.get(i) + "-" + boys.get(i));
                } else {
                    matchList.add(girls.get(i));
                }
            }
        }
        return matchList;
    }
}