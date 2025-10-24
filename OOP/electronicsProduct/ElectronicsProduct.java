package electronicsProduct;

public class ElectronicsProduct {
    int productID;
    String name;
    double price;

    public ElectronicsProduct(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountPercent) {
        price -= price * (discountPercent / 100);
    }
}