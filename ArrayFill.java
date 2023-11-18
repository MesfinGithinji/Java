import java.util.Scanner;

public class ArrayFill {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");
		int x = scanner.nextInt();

		scanner.close();

		int arr[] = new int[10];

		for (int i=0; i < arr.length; i++){
			arr[i] = i % x;
		}

		for (int z=0; z < arr.length; z++){
			System.out.println("N["+z+"]= " + arr[z]);
		}

	}
}
