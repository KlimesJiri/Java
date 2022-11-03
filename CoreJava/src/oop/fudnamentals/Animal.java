package oop.fudnamentals;

public class Animal {
    /*
    Create an Animal class

    Every animal has a hunger value, which is a whole number
    Every animal has a thirst value, which is a whole number
    When creating a new animal instance these values must be set to the default 50 value
    Every animal can eat() which decreases its hunger by one
    Every animal can drink() which decreases its thirst by one
    Every animal can play() which increases both its hunger and thirst by one
    */

    private int hunger;
    private int thirst;

    public Animal(){
        hunger = 50;
        thirst = 50;
    }

    public void eat(){
        hunger--;
    }

    public void drink(){
        thirst--;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }

    public void play(){
        hunger++;
        thirst++;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal cow = new Animal();
        Animal pig = new Animal();
        for (int i = 0; i < 5; i++) {
            dog.play();
        }
        System.out.println(dog);
        for (int i = 0; i < 3; i++) {
            dog.eat();
            dog.drink();
        }
        System.out.println(dog);
    }
}
