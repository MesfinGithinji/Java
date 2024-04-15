import java.util.Arrays;

public class MoreArrays {
	public static void main(String[] args){
		int[] myArr = {134,221,334,520,440,654,756,930,875};

		String[] mySecArr = {"Mesh","Luke","Mark","John"};

		System.out.println("Original Integer Array := " + Arrays.toString(myArr));
		Arrays.sort(myArr);
		System.out.println("Sorted Integer Array := " + Arrays.toString(myArr));

		System.out.println("\nOriginal String Array := " + Arrays.toString(mySecArr));
		Arrays.sort(mySecArr);
		System.out.println("Sorted String Array := " + Arrays.toString(mySecArr));
	}
}
