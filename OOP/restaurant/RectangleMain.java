package restaurant;

public class RectangleMain {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.addItem(new MenuItem("Pizza", 8.99, 4.5));
        r.addItem(new MenuItem("Burger", 5.99, 4.0));
        System.out.println("Average rating: " + r.averageRating());
    }
} 

