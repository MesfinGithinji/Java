import java.util.Scanner;
/* This import statement gives me access to the class scanner
 * This class has methods that give me access to standard input(input from the keyboard)
 * */

class UserInput{
	public static void main(String args[]){
		//first lets create a new scanner object that will give us access to what the user will input
		//System.in represents the standard input stream, which by default is the keyboard. 
		//It allows the program to read data entered by the user from the console.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first Number: ");
		int num1 = scanner.nextInt();
		//nextInt() makes sure what the user enters is an integer

		System.out.println("Enter the second Number: ");
		int num2 = scanner.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum of your two numbers is: " + sum);

		scanner.close();
		//have to close this once done because the scanner object got system resources so we have to release them once done
		
	}
}
