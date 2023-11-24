import java.util.Scanner;

public class primeChecker {
    public static void main(String[] args) {
        //scanner object 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check if a number is prime returns a boolean , true or false
    private static boolean isPrime(int n) {
	//n in the number entered by the user
        if (n <= 1) {
            return false;
        }
	
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
