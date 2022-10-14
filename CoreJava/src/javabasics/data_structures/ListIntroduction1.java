package javabasics.data_structures;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        System.out.println(names.size());

        names.add("William");

        System.out.println(names.isEmpty());

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());

        System.out.println(names.get(2));

        for (String name: names) {
            System.out.println(name);
        }

        for (String name: names) {
            System.out.println(names.indexOf(name) + 1 + ". " + name);
        }

        names.remove(1);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(names.size() - 1 - i));
        }

        names.removeAll(names);

        System.out.println(names.size());
    }
}
