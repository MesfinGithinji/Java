import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        
        double radius = scan.nextDouble();
        double n = 3.14159;
        double area = n * (radius * radius);

        System.out.printf("The area of your circle is: %.4f\n", area);
        scan.close();
    }
}
