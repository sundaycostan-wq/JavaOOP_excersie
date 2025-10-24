package circle;

public class CircleMian {
     public static void main(String[] args) {
   
        Circle circle = new Circle(5.0);
        
        System.out.println("Initial Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        
        circle.setRadius(10.0);
        
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}


