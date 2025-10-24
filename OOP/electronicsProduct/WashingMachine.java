package electronicsProduct;

public class WashingMachine extends ElectronicsProduct {
    int warrantyPeriod;

    public WashingMachine(int productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void extendWarranty(int extraMonths) {
        warrantyPeriod += extraMonths;
    }
}