package strings;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        System.out.println();
        System.out.println(quote);
        System.out.println();

        StringBuilder sb = new StringBuilder(quote);

        sb.insert(20, " always takes longer than");

        System.out.println(sb);
    }
}