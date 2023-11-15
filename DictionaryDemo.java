import java.util.HashMap;
import java.util.Map;

public class DictionaryDemo {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("James Mike", "0722345678");
        phoneBook.put("Andre Wilson", "01114345678");
        phoneBook.put("Jasmine Rebecca", "0205345678");

        // Printing the entire dictionary (hash map)
        System.out.println("This is the entire Dictionary(HashMap)");
        System.out.println(phoneBook);

        // Retrieving a value based on its key
        System.out.println("The value mapped to the key Andre Wilson is: " + phoneBook.get("Andre Wilson"));
     
        // Printing all the keys
	    System.out.println("\nHere are all the keys:");
        System.out.println(phoneBook.keySet());

        // Printing all the values
	    System.out.println("\nHere are all the values:");
        System.out.println(phoneBook.values());
    }
}
