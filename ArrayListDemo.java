import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Accessing elements using for-each loop
        System.out.println("Elements in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Accessing elements using traditional for loop
        System.out.println("\nAccessing elements using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Checking if an element exists in the ArrayList
        String searchFruit = "Banana";
        if (fruits.contains(searchFruit)) {
            System.out.println("\n" + searchFruit + " is present in the list.");
        } else {
            System.out.println("\n" + searchFruit + " is not present in the list.");
        }

        // Removing an element from the ArrayList
        String removeFruit = "Orange";
        fruits.remove(removeFruit);
        System.out.println("\nAfter removing " + removeFruit + ":");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Getting the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + fruits.size());

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList cleared. Size now: " + fruits.size());
    }
}

