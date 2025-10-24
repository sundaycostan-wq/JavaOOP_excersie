package customers;

public class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer lc = new LoyalCustomer("Mia", "mia@email.com", 10);
        lc.addPurchase(200);
        lc.addPurchase(300);
        double total = lc.totalExpenditure();
        System.out.println("Total after discount: " + lc.applyDiscount(total));
    }
}