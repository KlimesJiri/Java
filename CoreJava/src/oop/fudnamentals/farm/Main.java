package oop.fudnamentals.farm;

public class Main {
    /*
        Reuse your Animal class
        Create a Farm class
            it has a list of Animals listOfAnimals
            it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
            it has two methods:
                breed() -> creates a new animal if there's place for it
                sell() -> removes the least hungry animal

     */
    public static void main(String[] args) {
        Farm farm = new Farm(50);
        Animal cow = new Animal();
        Animal sheep = new Animal();

        Animal goat = new Animal();

        farm.getListOfAnimals().add(cow);
        farm.getListOfAnimals().add(sheep);

        for (int i = 0; i < 2; i++) {
            cow.play();
        }
        sheep.play();
        System.out.println(sheep.toString());
        System.out.println(cow.toString());

        farm.breed();

        System.out.println(farm.getListOfAnimals());

        farm.sell();

        System.out.println(farm.getListOfAnimals());
    }
}
