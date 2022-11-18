package theory;

public class Types {
    public static void main(String[] args) {

        // PRINTING VALUES WITH DIFFERENT TYPES

        // Prints a string to the terminal window
        System.out.println("Hello, World!");

        // Prints an integer to the terminal window
        System.out.println(42);

        // Prints a floating point number to the terminal window
        System.out.println(3.141592);


        // INTEGERS

        // Positive, negative and zero (not null)
        System.out.println(42);  // Prints 42
        System.out.println(-1);  // Prints -1
        System.out.println(0);   // Prints 0

        // A simple integer is represented in 4 bytes (32bit)
        // Maximum value:  2 147 483 647
        System.out.println(2147483647);
        // Minimum value: -2 147 483 648
        System.out.println(-2147483648);

        //System.out.println(2147483648);


        // FLOATS

        // Positive, negative and zero (not null)
        System.out.println(3.1415);   // Prints 3.1415
        System.out.println(-1.5);     // Prints -1.5
        System.out.println(0.0);      // Prints 0.0

        // Leading and closing zero is not mandatory
        System.out.println(.5);      // Prints 0.5
        System.out.println(5.);      // Prints 5.0


        // NUMBER OPERATIONS

        // Arithmetic operations
        System.out.println(1 + 1);    // Prints 2
        System.out.println(5 - 2);    // Prints 3
        System.out.println(3 * 4);    // Prints 12
        System.out.println(6 / 2);    // Prints 3
        System.out.println(5 / 2);    // Prints 2
        System.out.println(5. / 2);   // Prints 2.5
        System.out.println(5 / 2.);   // Prints 2.5
        System.out.println(5. / 2.);  // Prints 2.5
        System.out.println(5 % 2);    // Prints 1


        // BOOLEANS

        // true, false
        System.out.println(true);    // Prints true
        System.out.println(false);   // Prints false

        // Boolean Operators
        // Negation
        System.out.println(!true);   // Prints false
        System.out.println(!false);  // Prints true

        // And
        System.out.println(true && true);    // Prints true
        System.out.println(true && false);   // Prints false
        System.out.println(false && true);   // Prints false
        System.out.println(false && false);  // Prints false

        // Or
        System.out.println(true || true);    // Prints true
        System.out.println(true || false);   // Prints true
        System.out.println(false || true);   // Prints true
        System.out.println(false || false);  // Prints false


        // STRINGS

        // String and special characters
        System.out.println("apple");   // Prints apple
        System.out.println("don't");   // Prints don't
        System.out.println("\"Everything you can imagine is real.\" - Picasso"); // Prints "Everything you can imagine is real." - Picasso

        // String Operators
        // Concatenation
        // Concat string with string
        System.out.println("tooth" + "brush"); // Prints toothbrush

        // Concat string with number
        System.out.println("My favorite number is: " + 8); // Prints My favorite number is: 8
    }
}
