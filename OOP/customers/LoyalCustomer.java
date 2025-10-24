package customers;

public class LoyalCustomer extends Customer {
    double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double applyDiscount(double total) {
        return total - (total * discountRate / 100);
    }
}