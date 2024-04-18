public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 12);
        
        System.out.println("The area of the rectangle is " + rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimeter());
        
        rectangle.setWidth(6);
        rectangle.setHeight(12);
        
        System.out.println("\nThe area of the rectangle is now " + rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is now " + rectangle.calculatePerimeter());
    }
}

