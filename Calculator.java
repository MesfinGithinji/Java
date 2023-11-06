import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the calculator");
		System.out.println("Enter First Number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Enter operator (+, -, *, /): ");
		String operator = scanner.next();

		System.out.println("Enter Second Number: ");
		double num2 =  scanner.nextDouble();

		switch (operator){
		case "+":
			double result = num1 + num2;
			System.out.println("Result is : " + result);
			break;
		case "-":
		       	result = num1 - num2;
                        System.out.println("Result is : " + result);
			break;
		case "/":
			if (num1 != 0 && num2 != 0){
				result = num1 / num2;
				System.out.println("Result is : " + result);
			} else {
				System.out.println("Cannot do zero division");
			}
			break;
		case "*":
                        result = num1 * num2;
                        System.out.println("Result is : " + result);
			break;
		default:
			System.out.println("Done with calculation");
	}

	scanner.close();
     }
}
