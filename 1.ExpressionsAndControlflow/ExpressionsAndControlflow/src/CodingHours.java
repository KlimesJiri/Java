
public class CodingHours {
    public static void main(String[] args) {
        // An average coding student codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        // 6 HOURS A DAY - 5 DAYS PER WEEK - 17 WEEKS PER SEMESTER

        double totalHourCount = 6 * 5 * 17;
        System.out.println(totalHourCount);

        double codingHoursPercentage = (totalHourCount / (52*17)) * 100;
        System.out.println(codingHoursPercentage);

    }
}