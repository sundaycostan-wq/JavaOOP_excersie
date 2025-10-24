package vehicle;

    public class Truck extends Vehicle {
    double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload capacity: " + payloadCapacity + " kg");
    }
}

