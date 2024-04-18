public class Rectangle {

    //instance attributes
    private double width;
    private double length;

    //constructor
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    //getter methods
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    //setter methods
    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double length){
        this.length = length;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * length;
    }

    //Method to calculate Perimeter
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
