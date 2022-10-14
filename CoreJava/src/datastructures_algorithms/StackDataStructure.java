package datastructures_algorithms;

import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {

        // Stack is a LIFO data structure: Last-In First-Out

        //      Stores objects into a sort of vertical tower
        //      by placing them on "top" of each other ony by one

        //      push() method adds to the top
        //      pop() method removes from the top and returns the object

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        // Popping returns the object popped
        String currentPoppedGame = stack.pop();
        System.out.println(currentPoppedGame);

        // Takes a look at the item/object on the top of stack
        System.out.println(stack.peek());

        // Searches through the stack from top to bottom (INDEXING STARTS AT 1 NOT 0)
        System.out.println(stack.search("Skyrim"));

        // Stack is not
    }
}
