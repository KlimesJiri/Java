package javabasics.data_structures.old_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {

        // Create a simple calculator application which reads parameters from the prompt and prints the result back.
        // The calculator should support the following operators: +, -, *, /, %
        // The format of the input expressions must be: {operator} {operand} {operand}
        // Input examples:
        //    "+ 3 3" (the result will be 6)
        //    "* 4 4" (the result will be 16)
        //    "/ 4 3" (the result will be 1)
        //
        // In the division (/) case, the result should be a whole number, e.g. 20 / 8 = 2, 10 / 3 = 3, etc.

        // To make it work use the `Scanner` class to get input from the user. Create a method named `calculate()` and
        // pass the input as a parameter into it. The method should return a result of the calculation as an `Integer`.
        //
        // The process should work like this:
        // - Start the program
        // - Print: "Please type in the expression:" using System.out.println
        //   (Wait for the user input)
        // - After receiving the input print the result number to the prompt
        // - Exit the program

        // Input & Output
        //
        // Please type in the expression:
        // + 10 3
        // 13

        Scanner scanner = new Scanner(System.in);

        char operation;
        List<String> list = new ArrayList<>(2);

        System.out.println("Please enter the desired operation - options:  +  -  *  /  % ");
        operation = scanner.next().charAt(0);
        System.out.println("Enter the first number(integer) in equation: ");
        list.add(scanner.next());
        System.out.println("Enter the first number(integer) in equation: ");
        list.add(scanner.next());
//        System.out.println(operation);
//        System.out.println(list);

        System.out.println(calculate(operation, list));
        scanner.close();
    }

    private static Integer calculate(char operation, List<String> list){


        Integer outcome = 0;

        if (operation == '+'){
            outcome = Integer.valueOf(list.get(0)) + Integer.valueOf(list.get(1));
        } else if (operation == '-'){
            outcome = Integer.valueOf(list.get(0)) - Integer.valueOf(list.get(1));
        } else if (operation == '*'){
            outcome = Integer.valueOf(list.get(0)) * Integer.valueOf(list.get(1));
        } else if (operation == '/'){
            outcome = Integer.valueOf(list.get(0)) / Integer.valueOf(list.get(1));
        } else if (operation == '%'){
            outcome = Integer.valueOf(list.get(0)) % Integer.valueOf(list.get(1));
        }

        return outcome;
    }

}