package javabasics.expressions_and_controlflow;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String name = "Jirka";
        int age = 23;
        double height = 195.;
        boolean married = false;

        System.out.print("My name is " + name + " and I am " + age + " years old. I am " + height + " cm tall and I am ");
        if (married == true){
            System.out.print("married.");
        } else {
            System.out.print("not married.");
        }
    }
}