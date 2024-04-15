import java.util.ArrayList;

public class InitializeArrayList {
    public static void main(String[] args) {
        // Initialize an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

	// size of the list
	int size = 10;

        // Add elements to the ArrayList
        for (int i=0; i<size; i++) {
		arrayList.add(i);
	}
        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}

