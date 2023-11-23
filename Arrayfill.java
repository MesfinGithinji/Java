import java.io.*;
import java.util.*;

public class Arrayfill {
	public static void main (String[] args) throws IOException {
		//create scanner object
		Scanner scanner = new Scanner(System.in);
		//prompt the use for the number
		System.out.println("Enter Number to be doubled: ");
		int x = scanner.nextInt();
		//create our array 
		int[] arr = new int[10];
		arr[0] = x;

		//for loop to loop through the array from index 1 to 9
		for (int i=1; i < arr.length ; i++){
			arr[i] = arr[i-1] * 2; 
		}
		for (int y=0; y < arr.length; y++){
			System.out.println("N[" + y + "]= " + arr[y]);
		}
	}
}
