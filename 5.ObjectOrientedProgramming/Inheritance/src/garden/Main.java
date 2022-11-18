package oop.inheritance.garden;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.addPlant(new Flower("yellow"));
        garden.addPlant(new Flower("blue"));

        garden.addPlant(new Tree("purple"));
        garden.addPlant(new Tree("orange"));

        garden.getStatus();

        garden.waterPlants(40);

        garden.waterPlants(70);
    }
}
