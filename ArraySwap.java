import java.io.*;

public class ArraySwap {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 numbers separated by spaces");
		//put our input values into an array
		String[] inputValues = bufferedReader.readLine().split(" ");

		//need two 'pointers' one to track elements from the front of the array 
		//and another to track elements from the end of the array
		//then swap the values 
		for (int i = 0, j = inputValues.length - 1; i < j; i++, j--){
			//temp variable 
			String temp = inputValues[j];//start with whatever is at the back
			inputValues[j] = inputValues[i];
			inputValues[i] = temp;
		}
		//for (int x=0; x<inputValues.length; x++){
		//	System.out.println("arr["+ x + "]= " + inputValues[x]);
		//}
		for (String value: inputValues) {
			System.out.println(value);
		}
	}
}
