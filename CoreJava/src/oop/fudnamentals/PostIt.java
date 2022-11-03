package oop.fudnamentals;

public class PostIt {

    /*
    Create a PostIt class that has
            a backgroundColor represented by a string
            a text on it
            a textColor represented by a string

            Create a few example post-it objects:
            an orange with blue text: "Idea 1"
            a pink with black text: "Awesome"
            a yellow with green text: "Superb!"
    */

    private String backgroundColor;
    private String text;
    private String textColor;

    public PostIt(String backgroundColor, String text, String textColor){
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("Orange", "Idea 1", "Blue");

        PostIt postIt2 = new PostIt("Pink", "Awesome", "Black");

        PostIt postIt3 = new PostIt("Yellow", "Superb", "Green");
    }

}
