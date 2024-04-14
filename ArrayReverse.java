import java.util.Arrays;

public class ArrayReverse { 
     // function that reverses array and stores it in another array 
    static void reverse(int arr[], int size) 
    { 
        int[] newArr = new int[size]; 
        int j = size; 
        for (int i = 0; i < size; i++) { 
            newArr[j - 1] = arr[i]; 
            j = j - 1; 
        } 
  
        // printing the reversed array 
        /*System.out.println("\nReversed array is: \n"); 
        for (int k = 0; k < size; k++) { 
            System.out.println(newArr[k]); 
        } */

	System.out.println("Reversed array is: " + Arrays.toString(newArr));
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        System.out.println("Original Array is: " + Arrays.toString(arr));
	reverse(arr, arr.length); 
    } 
} 
