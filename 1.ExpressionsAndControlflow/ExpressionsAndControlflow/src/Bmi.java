
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        double bmi = massInKg / (heightInM * heightInM);

        System.out.println("The BMI for the values given is: " + bmi);
    }
}