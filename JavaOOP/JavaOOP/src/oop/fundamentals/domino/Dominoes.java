package oop.fundamentals.domino;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> dominoesOrdered = new ArrayList<>();

        if (dominoesOrdered.size() == 0){
            dominoesOrdered.add(dominoes.get(0));
            dominoes.remove(0);
        }
        for (int i = 0; i < dominoesOrdered.size(); i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                if (dominoesOrdered.get(0).getLeftSide() == dominoes.get(j).getRightSide()){
                    dominoesOrdered.add(0, dominoes.get(j));
                    dominoes.remove(dominoes.get(j));
                } else if (dominoesOrdered.get(dominoesOrdered.size() - 1).getRightSide() == dominoes.get(j).getLeftSide()){
                    dominoesOrdered.add(dominoes.get(j));
                    dominoes.remove(dominoes.get(j));
                } else if (dominoes.size() == 1){
                    if (dominoes.get(0).getLeftSide() == dominoesOrdered.get(dominoesOrdered.size()-1).getRightSide()){
                        dominoesOrdered.add(dominoes.get(0));
                        dominoes.remove(0);
                    } else if (dominoes.get(0).getRightSide() == dominoesOrdered.get(0).getLeftSide()){
                        dominoesOrdered.add(0, dominoes.get(0));
                        dominoes.remove(0);
                    }
                }
            }
        }

        System.out.println("Dominoes without match " + dominoes);
        System.out.println(dominoesOrdered);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));


        dominoes.add(new Domino(6, 10));
        dominoes.add(new Domino(10, 11));
        dominoes.add(new Domino(11, 4));

        // TEST DOMINO for weird cases
        dominoes.add(new Domino(140, 115));
        dominoes.add(new Domino(11, 11));
        dominoes.add(new Domino(10, 11));
        dominoes.add(new Domino(10, 11));
        dominoes.add(new Domino(10, 11));
        dominoes.add(new Domino(10, 11));
        dominoes.add(new Domino(10, 11));
        dominoes.add(new Domino(-10, 11000));

        return dominoes;
    }
}