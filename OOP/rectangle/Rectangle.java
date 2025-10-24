package rectangle;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

}
