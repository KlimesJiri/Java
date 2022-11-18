package theory;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 12;
        a += 4;
        System.out.println(a);     // Prints 16

        int b = 12;
        b -= 4;
        System.out.println(b);     // Prints 8

        int c = 12;
        System.out.println(c++);   // Prints 12
        System.out.println(c);     // Prints 13

        int d = 12;
        System.out.println(++d);   // Prints 13
        System.out.println(d);     // Prints 13

        int e = 12;
        System.out.println(e--);   // Prints 12
        System.out.println(e);     // Prints 11

        int f = 12;
        System.out.println(--f);   // Prints 11
        System.out.println(f);     // Prints 11

        int g = 12;
        g *= 3;
        System.out.println(g);     // Prints 36

        int h = 12;
        h /= 3;
        System.out.println(h);     // Prints 4

        int i = 12;
        i %= 7;
        System.out.println(i);     // Prints 5
    }
}