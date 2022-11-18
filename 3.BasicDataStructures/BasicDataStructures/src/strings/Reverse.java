package strings;

public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
        System.out.println();
        System.out.println(reverse2(toBeReversed));
    }

    public static String reverse(String input){

        char[] output = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            output[i] = input.charAt(input.length() - 1 - i);
        }

//        for (int i = input.length() - 1; i >= 0; i--) {
//            output[input.length() - i - 1] = input.charAt(i);
//        }

        return String.valueOf(output);
    }

    public static String reverse2(String input){

        StringBuilder sb = new StringBuilder(input);

        input = String.valueOf(sb.reverse());

        return input;

    }
}