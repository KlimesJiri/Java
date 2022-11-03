package oop.fudnamentals.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Animal> listOfAnimals = new ArrayList<>();

    private int limit;

    public Farm(){
        limit = 100;
    }

    public Farm(int limit){
        this.limit = limit;
    }

    public void breed(){
        if (listOfAnimals.size() < limit){
            Animal animal = new Animal();
            listOfAnimals.add(animal);
        }
    }

    public List<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void sell(){
        Animal leastHungryAnimal = listOfAnimals.get(0);
        for (int i = 0; i < listOfAnimals.size(); i++) {
            if (listOfAnimals.get(i).getHunger() > leastHungryAnimal.getHunger()){
                leastHungryAnimal = listOfAnimals.get(i);
            }
        }
        listOfAnimals.remove(leastHungryAnimal);
    }
}
