
package shape;
import shape.ShapeDemo;
public class ShapeDemo {
    public static void main(String[] args) {
        // Create instances of each shape
        Rectangle rect = new Rectangle(5.0, 4.0);
        Circle circ = new Circle(3.0);
        Triangle tri = new Triangle(3.0, 4.0, 5.0, 4.0); // Sides: 3,4,5; height:4
        // Calculate and print area and perimeter
        System.out.println("Rectangle - Area: " + rect.calculateArea() + ", Perimeter: " + rect.calculatePerimeter());
        System.out.println("Circle - Area: " + circ.calculateArea() + ", Perimeter: " + circ.calculatePerimeter());
        System.out.println("Triangle - Area: " + tri.calculateArea() + ", Perimeter: " + tri.calculatePerimeter());
    }
}