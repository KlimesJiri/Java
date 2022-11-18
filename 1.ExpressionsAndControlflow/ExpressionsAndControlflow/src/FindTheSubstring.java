
public class FindTheSubstring {
    public static void main(String[] args) {
        // Create a function that takes two strings as a parameter
        // Returns the starting index where
        // the second one is starting in the first one
        // Returns `-1` if the second string is not in the first one

        // Example:

        // should print: `17`
        System.out.println(subStr("this is what I'm searching in", "searching"));

        // should print: `-1`
        System.out.println(subStr("this is what I'm searching in", "not"));

        // should print '8'
        System.out.println(subStr("this is what I'm searching in", "wha"));

        // should print '3'
        System.out.println(subStr("this is what I'm searching in", "s"));
    }

    public static int subStr(String input, String secondInput) {
        if (input.contains(secondInput)){
            return input.indexOf(secondInput);
        }
        return -1;
    }
}