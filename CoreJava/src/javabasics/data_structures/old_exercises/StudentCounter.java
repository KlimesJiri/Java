package javabasics.data_structures.old_exercises;

import java.util.*;

public class StudentCounter {

    public static void main(String... args) {

        List<Map<String, Object>> studentMaps = new ArrayList<>();

        // Given this list of hash maps...

        Map<String, Object> student0 = new HashMap<>();
        student0.put("name", "Theodor");
        student0.put("age", 9);
        student0.put("candies", 2);
        studentMaps.add(student0);

        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Paul");
        student1.put("age", 10);
        student1.put("candies", 1);
        studentMaps.add(student1);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "Mark");
        student2.put("age", 7);
        student2.put("candies", 3);
        studentMaps.add(student2);

        Map<String, Object> student3 = new HashMap<>();
        student3.put("name", "Peter");
        student3.put("age", 12);
        student3.put("candies", 5);
        studentMaps.add(student3);

        Map<String, Object> student4 = new HashMap<>();
        student4.put("name", "Olaf");
        student4.put("age", 12);
        student4.put("candies", 7);
        studentMaps.add(student4);

        Map<String, Object> student5 = new HashMap<>();
        student5.put("name", "George");
        student5.put("age", 3);
        student5.put("candies", 2);
        studentMaps.add(student5);

        // Create a function called getListOfNames() which takes a list of student maps (studentMaps) and returns
        // the names of students (as a list of strings) who have more than 4 candies

        // Expected output: [Peter, Olaf]
        System.out.println(getListOfNames(studentMaps));

        // Create a function called getSumOfAges() which takes a list of student maps (studentMaps) and returns
        // the sum (as an integer) of the ages of students who have less than 5 candies

        // Expected output: 29
        System.out.println(getSumOfAges(studentMaps));
    }

    static List<String> getListOfNames(List<Map<String, Object>> students){
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i <students.size() ; i++) {
            int candies = Integer.valueOf(students.get(i).get("candies").toString());
            if (candies > 4){
                returnList.add(students.get(i).get("name").toString());
            }
        }
        return returnList;
    }

    static int getSumOfAges(List<Map<String, Object>> students){
        int sum = 0;
        for (int i = 0; i <students.size() ; i++) {
            int candies = Integer.valueOf(students.get(i).get("candies").toString());
            if (candies < 5){
                sum += Integer.valueOf(students.get(i).get("age").toString());
            }
        }
        return sum;
    }
}