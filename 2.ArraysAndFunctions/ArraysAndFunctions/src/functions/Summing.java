package functions;

public class Summing {
    public static void main(String[] args) {
        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
        System.out.println(sumFun(10));

    }

    public static int sumFun(int parameter){
        int fun = 0;
        for (int i = 0; i <= parameter; i++) {
            fun += i;
        }
        return fun;
    }
}
