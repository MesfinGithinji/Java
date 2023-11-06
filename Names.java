import java.util.Scanner;

class Names{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your First Name: ");
		String myfirstName = scanner.nextLine();

		System.out.println("Enter your Second Name: ");
		String mySecondName = scanner.nextLine();

		System.out.println("\nYour full name is: " + myfirstName + mySecondName);

		scanner.close();
	}
}
