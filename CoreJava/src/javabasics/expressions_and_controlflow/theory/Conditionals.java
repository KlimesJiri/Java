package javabasics.expressions_and_controlflow.theory;

public class Conditionals {
    public static void main(String[] args) {
        int a = 13;

        if (a == 13) {
            System.out.println("Yaaay! The value of the \"a\" variable is 13"); // This block will run
        }

        if (a == 8) {
            System.out.println("Yaaay! The value of the \"a\" variable is 8"); // This block will NOT run
        }


        int b = 20;

        if (b < 10) {
            System.out.println("Yaaay! The value of the \"b\" variable is lower than 10"); // This block will NOT run
        } else {
            System.out.println("Yaaay! The value of the \"b\" variable is higher than 10"); // This block will run
        }


        int c = 15;

        if (c < 10) {
            System.out.println("Yaaay! The value of the \"c\" variable is lower than 10"); // This block will NOT run
        } else if (c < 20) {
            System.out.println("Yaaay! The value of the \"c\" variable is higher than 10"); // This block will run
        } else {
            System.out.println("Yaaay! The value of the \"c\" variable is higher than 10"); // This block will NOT run
        }


        boolean thirsty = true;
        boolean hungry = false;

        if (thirsty && hungry) {
            System.out.println("Lunch time!");
        } else if (thirsty || hungry) {
            System.out.println("Snack time!");
        } else {
            System.out.println("No food for you.");
        }
    }
}