package javabasics.expressions_and_controlflow;

public class IntroduceYourself {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line:
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87

        String name = "Jirka";
        int age = 23;
        double height = 195.;
        boolean married = false;

        System.out.print("My name is " + name + " and I am " + age + " years old. I am " + height/100 + " meters tall and I am ");
        if (married == true){
            System.out.print("married.");
        } else {
            System.out.print("not married.");
        }
    }
}