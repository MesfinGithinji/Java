import java.util.*;

public class Arithmetic {
	
	public int addnums(int a,int b){
		int sum = a + b;
		return sum;
	}

	public int multiply(int x, int y){
		int prod = x * y; 
		return prod;
	}

	public int divide(int n1 , int n2){
		int div =  n1 / n2;
		return div;
	}
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first Number: ");
                int num1 = scanner.nextInt();
                System.out.println("Enter Second Number: ");
                int num2 =  scanner.nextInt();

                Arithmetic arithmetic = new Arithmetic();

		System.out.println(num1 + " + " + num2 + " = " + arithmetic.addnums(num1, num2));
	        System.out.println(num1 + " * " + num2 + " = " + arithmetic.multiply(num1, num2));
        	System.out.println(num1 + " / " + num2 + " = " + arithmetic.divide(num1, num2));

                scanner.close();
        }


}
