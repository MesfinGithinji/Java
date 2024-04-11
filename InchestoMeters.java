import java.util.Scanner;

public class InchestoMeters {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter you measurements in inches: ");
		double inches = scanner.nextDouble();

		double meters = inches * 0.0254;

		System.out.println(inches + " inches in Meters is = " + meters);
	}
}
