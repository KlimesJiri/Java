package oop.inheritance.aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private List<Aircraft> aircraftList;

    private int ammoStored;
    private int health;

    Carrier(int ammoStored, int health){
        aircraftList = new ArrayList<>();
        this.ammoStored = ammoStored;
        this.health = health;
    }

    public void add(Aircraft aircraft){
        aircraftList.add(aircraft);
    }

    void fill(){
        try {
            int ammoNeeded = 0;
            for (Aircraft aircraft : aircraftList){
                ammoNeeded += aircraft.getMaxAmmo() - aircraft.getCurrentAmmo();
            }
            if (ammoStored < ammoNeeded){
                for (Aircraft aircraft : aircraftList){
                    if (aircraft.isPriority()){
                        ammoStored = aircraft.refillAmmo(ammoStored);
                    }
                }
                for (Aircraft aircraft : aircraftList){
                    ammoStored = aircraft.refillAmmo(ammoStored);
                }
                return;
            }
            for (Aircraft aircraft : aircraftList){
                ammoStored = aircraft.refillAmmo(ammoStored);
            }
        } catch (Exception exception){
            System.err.println("There is no ammo in the Carrier!!!");
        }
    }

    void fight(Carrier carrier){
        int damage = 0;
        for (Aircraft aircraft : aircraftList){
            damage += aircraft.fight();
        }
        carrier.health -= damage;
    }

    int countTotalDamage(){
        int totalDamage = 0;
        for (Aircraft aircraft : aircraftList){
            totalDamage += aircraft.fight();
        }
        return totalDamage;
    }

    void getStatus(){
        if (health <= 0){
            System.out.println("It's dead Jim :(");
            return;
        }
        System.out.println("HP: " + health + ", Aircraft count: " + aircraftList.size() + ", Ammo Storage: " + ammoStored + ", Total Damage: " + countTotalDamage());
        for (Aircraft aircraft : aircraftList){
            if (aircraft.isPriority()){
                System.out.println(aircraft.getStatus());
            }
        }
        for (Aircraft aircraft : aircraftList){
            if (!aircraft.isPriority()){
                System.out.println(aircraft.getStatus());
            }
        }
    }
}

/*
    Task description
    Carriers
    Create a class that represents an aircraft-carrier

        The carrier should be able to store aircrafts
        Each carrier should have a store of ammo represented by a number
        The initial ammo should be given as a constructor parameter
        The carrier also has a health point which is also given as a constructor parameter

    Methods
    add()

        It should take a new aircraft and add it to its storage

    fill()

        It should fill all the aircrafts with ammo and subtract the taken ammo from the ammo storage
        If there is not enough ammo it should start to fill the aircrafts that are priority first
        It should throw an exception if there is no ammo when this method is called

    fight()

        It should take another carrier as a reference parameter and
            fire all the ammo from the aircrafts to it
            subtract all the damage from the other carrier's health points

    getStatus()

    It should return a string describing its, and all of its aircrafts' statuses in the following format:

    HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
    Aircrafts:
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
    Type F16, Ammo: 8, Base Damage: 30, All Damage: 240

    If the health points are 0 then it should return: It's dead Jim :(
 */