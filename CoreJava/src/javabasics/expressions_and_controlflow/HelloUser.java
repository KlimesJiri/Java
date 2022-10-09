package javabasics.expressions_and_controlflow;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please tell me your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}