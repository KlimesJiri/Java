
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {

        //Create a list with the following items:
        //    eggs, milk, fish, apples, bread and chicken
        List<String> shoppingList = new ArrayList<>(
                Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        //Create an application which prints out the answers to the following questions:

        //Do we have milk in the shopping list? (yes/no)
        if (shoppingList.contains("milk"))
            System.out.println("yes");
        else
            System.out.println("no");

        //Do we have bananas in the shopping list? (yes/no)
        if (shoppingList.contains("bananas"))
            System.out.println("yes");
        else
            System.out.println("no");

        //The full output of your main method should be the following:
        // yes
        // no
    }
}
