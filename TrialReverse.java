import java.util.Arrays;

public class TrialReverse {
	public static void main(String[] args){
		int[] theArr = { 100,200,300,400,500,600,700,800};
		System.out.println("The Original Array is: " + Arrays.toString(theArr));
		reverse(theArr , theArr.length);
	}

	static void reverse(int[] arr,int size){
		int[] newArr = new int[size];
		for (int i=0; i<size; i++) {
			newArr[i] = arr[size -1-i];
		}
		System.out.println("\nThe new reversed array is: " + Arrays.toString(newArr));
	}
}
