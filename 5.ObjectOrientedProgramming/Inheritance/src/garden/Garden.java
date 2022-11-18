package oop.inheritance.garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plants;

    Garden(){
        plants = new ArrayList<>();
    }

    void addPlant(Plant plant){
        plants.add(plant);
    }

    void getStatus(){
        for (Plant plant : plants){
            if (plant.needsWater()){
                System.out.println("The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " needs water");
            } else {
                System.out.println("The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " doesn't need water");
            }
        }
    }

    void waterPlants(int waterReceived){
        System.out.println("\nWatering with " + waterReceived);
        int thirstyPlants = 0;
        for (Plant plant : plants){
            if (plant.needsWater()){
                thirstyPlants++;
            }
        }
        int waterPerPlant = waterReceived / thirstyPlants;
        for (Plant plant : plants){
            plant.watering(waterPerPlant);
        }
        getStatus();
    }

}
