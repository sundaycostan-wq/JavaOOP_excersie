package shape;

import shape.shape;
 import java.lang.Math;
abstract class shape {

public abstract double calculateArea();
public abstract double calculatePerimeter();
}
class Rectangle extends shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
     public double calculateArea() {
        return width * height;
    }
     @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
class Circle extends shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Triangle extends shape {
    private double side1; 
    private double side2;
    private double side3;
    private double height;
    public Triangle(double side1, double side2, double side3, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }
     @Override
    public double calculateArea() {
        return (side1 * height) / 2;
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}



