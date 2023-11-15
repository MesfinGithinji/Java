import java.io.*;

public class ReplaceArray {
	public static void main (String[] args) throws IOException {
		BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your ten numbers: ");

		//lets read whatever is in our buffer separaetd by spaces and assign them into an array
		String[] inputValues = bufferedReader.readLine().split(" ");
		
		//create a new array that will store the input values
		int[] arr = new int[10];

		for (int i=0; i < inputValues.length; i++){
			arr[i] = Integer.parseInt(inputValues[i]);
			//check if the number is a negative or a positive
			if (arr[i] < 0 || arr[i] == 0 ){
				arr[i] = 1 ;
			}
		}//end of for loop that loops through the input values

		for (int x=0; x < arr.length; x++){
			System.out.println("arr["+x+"]="+arr[x]);
		}//print the value at each index
		
	}
}
