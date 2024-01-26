import java.util.Scanner;	

class greeting {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String first_name = scanner.nextLine();

		System.out.println("Hello " + first_name + " Nice to meet You.\nEnjoy Java");
	}
}
