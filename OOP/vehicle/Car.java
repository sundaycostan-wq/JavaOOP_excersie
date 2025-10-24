package vehicle;

public class Car extends Vehicle {
    double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk size: " + trunkSize + " cubic ft");
    }
}