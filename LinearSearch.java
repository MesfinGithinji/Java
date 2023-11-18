import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		//Create the scanner object 
		Scanner scanner = new Scanner(System.in);
		
		//prompt the user for an array of values
		System.out.println("Enter array of values ");

		//intialize the array
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
       		}
	
		//prompt the user for the target value
		System.out.println("\nEnter value to search for: ");
		
		//set target value
		int target = scanner.nextInt();

		//perform linear search
		int position = linearSearch(arr, target);

		if (position != -1){
			System.out.println("\nElement found at position : " +position);
		} else {
			System.out.println("Element not found");
		}
		
		// Close the scanner
                scanner.close();

	}
	
	/*
	 * the linear search method takes 2 parameters
	 * one is the array(the Data structure) we are searching through
	 * two is the targer (the actual value we are searching for)
	 */
	static int linearSearch(int[] arr , int target){
		//for loop to loop through the array elements one by one 
		for (int i=0; i < arr.length; i++){
			//compare the current element with the target value
			if (arr[i] == target){
				return i;
			}
		}
		return -1 ;//if target is not found
	}
}
