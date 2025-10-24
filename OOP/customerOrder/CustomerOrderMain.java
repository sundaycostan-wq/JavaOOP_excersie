package customerOrder;

public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder(101, "Anna", "2025-02-05", "123 Main St", "TN001");
        System.out.println("Order ID: " + order.orderID + ", Tracking: " + order.trackingNumber);
        order.updateTracking("Delivered");
        System.out.println("Updated Tracking: " + order.trackingNumber);
    }
}