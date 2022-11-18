
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {

        //We are going to represent our contacts in a map where both the keys and values are strings.

        //Create a map with the following key-value pairs:
        //      Name (key)	        Phone number (value)
        //      William A. Lathan	405-709-1865
        //      John K. Miller	    402-247-8568
        //      Hortensia E. Foster	606-481-6467
        //      Amanda D. Newland	319-243-5613
        //      Brooke P. Askew	    307-687-2982
        Map<String, String> phonebook = new HashMap<>()
        {{
            put("William A. Lathan", "405-709-1865");
            put("John K. Miller", "402-247-8568");
            put("Hortensia E. Foster", "606-481-6467");
            put("Amanda D. Newland", "319-243-5613");
            put("Brooke P. Askew", "307-687-2982");
        }};

        //Create an application which prints out the answers to the following questions:

        //What is John K. Miller's phone number?
        System.out.println(phonebook.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        for (String s : phonebook.keySet()){
            if (phonebook.get(s).equals("307-687-2982")){
                System.out.println(s);
            }
        }

        if (phonebook.containsKey("Chris E. Myers")) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
