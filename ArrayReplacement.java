import java.io.*;

public class ArrayReplacement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your 10 numbers (space-separated): ");

        // Read a line of input and split it into an array of strings
        String[] inputValues = bufferedReader.readLine().split(" ");

        // Create an array to store integers
        int[] X = new int[10];

        // Convert the string values to integers and handle null or negative values
        for (int i = 0; i < X.length; i++) {
            try {
                // Convert the string to an integer
                X[i] = Integer.parseInt(inputValues[i]);

                // Check if the number is negative or null
                if (X[i] == 0 || X[i] < 0) {
                    X[i] = 1;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                // Handle invalid input or insufficient values
                System.out.println("Invalid input. Please enter 10 space-separated numbers.");
                return;
            }

            
        }
	
	for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}

