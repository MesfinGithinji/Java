public class Circle {
    
    //instance attribute
    public double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //getter method
    public double getRadius(){
        return radius;
    }

    //setter method
    public void setRadius(double radius){
        this.radius = radius;
    }

    //method to calculate circumference 2*(PI*R)
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    
    //methods to calculate area PI*R*R
    public double area() {
        return Math.PI * radius * radius;
    }
}
