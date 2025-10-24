package customers;

import java.util.ArrayList;

public class Customer {
    String name;
    String email;
    ArrayList<Double> purchaseHistory = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
    }

    public double totalExpenditure() {
        double sum = 0;
        for (double a : purchaseHistory) sum += a;
        return sum;
    }
}
