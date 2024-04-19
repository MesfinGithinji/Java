public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.5);

        double area = circle1.area();
        System.out.println("The area of Circle 1 = " + area);

        circle1.setRadius(7.6);
        System.out.println("\nThe area of Circle 1 is now = " + circle1.area());
    }
}
