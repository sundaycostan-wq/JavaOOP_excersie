package inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryMain {
    
public class Product {
    private String name;
    private int quantity;
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String toString() { return name + " (Qty: " + quantity + ")"; }
}
public class Inventory {
    private List<Product> products = new ArrayList<>();
    private int lowThreshold;
    public Inventory(int lowThreshold) { this.lowThreshold = lowThreshold; }
    public void addProduct(Product p) { products.add(p); }
    
}
 public boolean removeProduct(String name) {
        List<Product> products = null;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }
    public List<Product> checkLowInventory() {
        List<Product> low = new ArrayList<>();
        Product[] products = null;
        int lowThreshold = 0;
        for (Product p : products) if (p.getQuantity() < lowThreshold) low.add(p);
        return low;
    }
    public List<Product> getProducts() { return getProducts(); }
}
