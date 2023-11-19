import java.io.*;
import java.util.Scanner;

public class linearSearch {
	public static void main (String[] args) {
		int[] arr = {11,24,33,45,56,67,78,89,90};

		int target = 33;

		int position = LinearSearch(arr,target);

		if (position != -1){
			System.out.println("Your Target = " + target + "\nWas found at index = " + position);
		} else {
			System.out.println("Target not found");
		}
	}

	static int LinearSearch (int[] arr , int target){
		for (int i=0; i < arr.length ; i++) {
			if (arr[i] == target) {
				return i ;
			}
		}
		return -1;
	}
}
