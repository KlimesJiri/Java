package oop.inheritance.aircraftcarrier;

public class Aircraft{

    private final int maxAmmo;
    private final int baseDamage;
    private String type;
    private int currentAmmo;

    Aircraft(String type, int maxAmmo, int baseDamage){
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        currentAmmo = 0;
    }

    int fight(){
        int damage = currentAmmo * baseDamage;
        return damage;
    }

    int refillAmmo(int refill){
        int missingAmmo = maxAmmo - currentAmmo;
        if (missingAmmo > refill){
            currentAmmo += refill;
            return 0;
        }
        refill -= missingAmmo;
        currentAmmo += missingAmmo;
        return refill;
    }

    String getType(){
        return type;
    }

    String getStatus(){
        return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + currentAmmo * baseDamage;
    }

    boolean isPriority() {
        if (type.equals("F35")){
            return true;
        }
        return false;
    }

    int getMaxAmmo() {
        return maxAmmo;
    }

    int getCurrentAmmo() {
        return currentAmmo;
    }
}

/*
    Task description
    Aircrafts

        Create a class that represents an aircraft
        There are 2 types of aircrafts: F16 and F35
        Both aircrafts should keep track of their ammunition

    F16

        Max ammo: 8
        Base damage: 30

    F35

        Max ammo: 12
        Base damage: 50

    All aircrafts should be created with an empty ammo storage
    Methods
    fight()

        It should use all the ammo (set it to 0) and it should return the damage it causes
            damage is calculated by multiplying the base damage by the ammunition

    refillAmmo()

        It should take a number as parameter that represents the ammunition coming from a station
        Increase the ammo of the aircraft by the right amount
        It can't have more ammo than the parameter value or the max ammo of the aircraft
        It should return the remaining (unused) ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288

    getType()

        It should return the type of the aircraft as a string

    getStatus()

        It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500

    isPriority()

        It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16

 */