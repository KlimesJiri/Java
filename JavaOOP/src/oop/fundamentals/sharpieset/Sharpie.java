package oop.fundamentals.sharpieset;

public class Sharpie {

    private String color;
    private Double width;
    private int inkAmount;

    public Sharpie(String color, Double width){
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    public void use(){
        inkAmount -= 10;
    }

    public int getInkAmount() {
        return inkAmount;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }

}
