import java.io.*;

/*
 * Lets calculate the sum of all even numbers from 1 to 50 
 * print the sum 
 * */

public class sumEven {
	public static void main (String[] args) {
		//initialize sum to zero
		int sum = 0;

		//lets use a for loop to populate it with even numbers
		for (int i=1; i <= 50; i++) {
			//check if number is even
			if ( i % 2 == 0 ) {
				sum += i;
			}
		}

		System.out.println("Sum of even numbers from 1 to 50 = " + sum);
	}
}
