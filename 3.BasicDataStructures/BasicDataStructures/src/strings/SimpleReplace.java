package strings;

public class SimpleReplace {
    public static void main(String... args){
        String example = "In a dishwasher far, far away";


        // BEFORE FIX
        example.replace("dishwasher", "galaxy");
        System.out.println(example + "\n");

        // I would like to replace "dishwasher" with "galaxy" in this `example` variable
        // but there is an issue in the code above
        // Please fix it for me!


        // AFTER FIX
        example = example.replace("dishwasher", "galaxy");

        // Expected output: In a galaxy far, far away
        System.out.println(example);
    }
}