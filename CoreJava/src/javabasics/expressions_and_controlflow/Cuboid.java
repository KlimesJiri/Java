package javabasics.expressions_and_controlflow;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000

        double sideA = 10;
        double sideB = 10;
        double sideC = 10;

        double surfaceArea = (sideA*sideB + sideB*sideC + sideC*sideA) * 2;
        System.out.println(surfaceArea);
        double volume = sideA * sideB * sideC;
        System.out.println(volume);
    }
}