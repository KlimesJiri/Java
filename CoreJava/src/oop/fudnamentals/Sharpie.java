package oop.fudnamentals;

public class Sharpie {
    /*
    Create a Sharpie class
        We should know the followings about each sharpie:
            color (which should be a string),
            width (which will be a number) and the
            inkAmount (another number)
        We need to specify the color and the width at creation
        Every sharpie is created with a default inkAmount value: 100
        We can use() the sharpie objects: using it decreases inkAmount by 10
     */
    private String color;
    private Double width;
    private int inkAmount;

    public Sharpie(String color, Double width){
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }

    public void use(){
        inkAmount -= 10;
    }

    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("blue", 5.);
        System.out.println(sharpie.toString());
        sharpie.use();
        System.out.println(sharpie.toString());
    }

}
