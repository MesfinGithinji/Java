import java.io.*;
import java.util.*;

public class NumberSeries {

    public static void main(String[] args) throws IOException{
	//buffer to read the stdin    
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        //get the number of queries
        int queries = Integer.parseInt(bufferedReader.readLine().trim());
        
	/*
	 * We need to check how many queries has the user entered and execute each query
	 * so wee need to loop through based on the number the user has entered
	 * so each iteration of this loop will process one query
	 */
        for (int q = 0; q < queries; q++) {
	    //so here we take what the user has entred and split it using spaces as a delimeter
	    //then the array will contain the individuual values for the query being currently executed
            String[] queryValues = bufferedReader.readLine().split(" ");
	    //take whatever is at position 0 and convert it into an int and assign it to a and do the same for the rest
            int a = Integer.parseInt(queryValues[0]);
            int b = Integer.parseInt(queryValues[1]);
            int n = Integer.parseInt(queryValues[2]);

            // Generate and print the series for the current query based on the formula
            int result = a;
            for (int i = 0; i < n; i++) {
                result += Math.pow(2, i) * b;
                System.out.print(result + " ");
            }
            System.out.println(); // Move to the next line for the next query's output
        }

        bufferedReader.close();
        
    
    }
}
