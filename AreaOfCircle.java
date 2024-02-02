import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        
        double radius = scan.nextDouble();
        double n = 3.14159;
        double area = n * (radius * radius);

        System.out.println("The area of your cirlce is:" + area);
        scan.close();
    }
}
