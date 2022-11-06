package enums;

import java.util.*;

public class ParkingLot {

/*
    Create a Car class with 2 enum properties
        enum of car types
        The types of these cars or vehicles is up to you
        enum of colors
    Create 256 Vehicles randomly and put them into a List
    Count and Print the number of same vehicles for each type
    Count and Print the number of same vehicles for each color
    Print the most frequently occurring vehicle

 */

    public static void main(String[] args) {

        Random random = new Random();

        List<Car> carList = new ArrayList<>();

        Car.Type[] allTypes = Car.Type.values();
        Car.CarColor[] allColors = Car.CarColor.values();

        System.out.println(Arrays.stream(allTypes).toList());
        System.out.println(Arrays.stream(allColors).toList());

        for (int i = 0; i < 256; i++) {
            int randType = random.nextInt(0, allTypes.length);
            int randColor = random.nextInt(0, allColors.length);
            carList.add(new Car(allTypes[randType],allColors[randColor]));
        }
        //System.out.println(carList);
        Map<Car.Type, Integer> typeCount = new HashMap<>();
        Map<Car.CarColor, Integer> colorCount = new HashMap<>();


        for (int i = 0; i < allTypes.length; i++) {
            typeCount.put(allTypes[i], 0);
        }
        for (int i = 0; i < allColors.length; i++) {
            colorCount.put(allColors[i], 0);
        }

        for(Car car: carList){
            typeCount.put(car.type, typeCount.getOrDefault(car.type, 0) + 1);
            colorCount.put(car.color, colorCount.getOrDefault(car.color, 0) + 1);
        }

        System.out.println("\n" + typeCount);
        System.out.println("\n" + colorCount);

        int maxValueInMap=(Collections.max(typeCount.values()));  // This will return max value in the HashMap
        for (Map.Entry<Car.Type, Integer> entry : typeCount.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
    }

}
