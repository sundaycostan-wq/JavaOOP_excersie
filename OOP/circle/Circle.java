package circle;

public class Circle {
    private double radius;
    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
}
}