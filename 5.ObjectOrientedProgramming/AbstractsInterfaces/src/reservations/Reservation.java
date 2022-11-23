package reservations;


import java.util.Random;

public class Reservation implements Reservationy{
    Random random = new Random();
    private String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    private String chosenDay;
    private String code = "";
    public Reservation(){
        getCodeBooking();
        getDowBooking();
    }

    @Override
    public String getDowBooking() {
        return chosenDay = daysOfWeek[random.nextInt(daysOfWeek.length)];
    }

    @Override
     public String getCodeBooking() {
        char nextChar;
        for (int i = 0; i < 8; i++) {
            if (random.nextInt(4) < 3){
                nextChar = (char) random.nextInt(65, 90);
            } else {
                nextChar = (char) random.nextInt(48, 57);
            }
            code += nextChar;
        }
        return code;
    }

    @Override
    public String toString() {
        return "Booking# " + code + " for " + chosenDay;
    }
}
