package customerOrder;


public class Customerorder {
    int orderID;
    String customer;
    String orderDate;

    public Customerorder(int orderID, String customer, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }
}