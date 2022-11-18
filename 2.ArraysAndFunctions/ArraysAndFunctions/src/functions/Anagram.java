package functions;

public class Anagram {
    public static void main(String[] args) {
        // Create a function named isAnagram() following your current language's style guide.
        // It should take two strings and return a boolean value depending on whether it's an anagram or not

        System.out.println(isAnagram("dog", "god"));
        System.out.println(isAnagram("Hello", "World"));

    }

    public static boolean isAnagram(String firstWord, String secondWord){
        StringBuilder str = new StringBuilder(firstWord);
        String reversed = String.valueOf(str.reverse());
        if (secondWord.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }
}