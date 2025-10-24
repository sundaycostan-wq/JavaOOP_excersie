package customerOrder;

public class OnlineOrder extends CustomerOrder {
    String deliveryAddress;
    String trackingNumber;

    public OnlineOrder(int orderID, String customer, String orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }

    public void updateTracking(String newStatus) {
        trackingNumber = newStatus;
    }
}