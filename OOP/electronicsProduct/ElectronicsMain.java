package electronicsProduct;

public class ElectronicsMain {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(101, "LG Washer", 500, 24);
        wm.applyDiscount(10);
        wm.extendWarranty(12);
        System.out.println("Price after discount: " + wm.price + ", Warranty: " + wm.warrantyPeriod + " months");
    }
}