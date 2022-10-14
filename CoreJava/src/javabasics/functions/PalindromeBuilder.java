package javabasics.functions;

public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(createPalindromeSimple("Hello"));

    }

    public static String createPalindromeSimple(String stringIn){
        String reverse = "";
        for (int i = stringIn.length() - 1; i >= 0; i--) {
            reverse += stringIn.charAt(i);
        }
        return stringIn + reverse;
    }


}
