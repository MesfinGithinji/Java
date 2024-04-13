import java.util.Arrays;
import java.util.Scanner;

//note about the Arrays.binarySearch() method: it requires the array to be sorted in ascending order for accurate results.

public class SearchBinary {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Target to Search for: ");
		int target = scanner.nextInt();

		int[] myArr = {223,345,987,435,673,145,578};
		
		// Sort the array before performing binary search
       		Arrays.sort(myArr);
		
		int result = Arrays.binarySearch(myArr, target);
		
		if (result >= 0){
			System.out.println("The target " + target + " is at index position " + result);
		} else {
			System.out.println("Error!!The target " + target + " hasn't been found");
		}
	}
}
