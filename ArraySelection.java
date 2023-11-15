import java.io.*;

public class ArraySelection {
	public static void main (String[] args) throws IOException {
		//create our buffer and prompt user for values
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Values: ");

		//read our values and store them in an Array sparated by spaces
		String[] inputValues = bufferedReader.readLine().split(" ");

		//create a new array which we will use to store our input values after we have parsed them into integers
		double[] arr = new double[100];

		//loop through our inputValues array , parse the data and push it into the new array
		for (int i=0; i < inputValues.length; i++){
		       	arr[i] = Double.parseDouble(inputValues[i]);
			//check if the data stored at each index is <= 10
			if (arr[i] <= 10) {
                                System.out.println("arr["+i+"]= "+arr[i]);
                        }

		}	

	}
}
