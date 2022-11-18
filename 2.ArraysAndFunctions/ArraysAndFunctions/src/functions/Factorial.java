package functions;
public class Factorial {
    public static void main(String[] args) {
        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input


        System.out.println(calculateFactorial(-5));
    }

    public static int calculateFactorial(int number){
        int sum = number;
        if (number == 0){
            return 1;
        } else if (number < 0) {
            System.out.print("Can not give factorial of a negative number, negative numbers always return: ");
            return -1;
        } else {
            for (int i = number - 1; i > 0; i--) {
                sum *= i;
            }
            return sum;
        }
    }
}
