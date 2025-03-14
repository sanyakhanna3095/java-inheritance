import java.util.Scanner;

// Base class: Order
class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }

    // Overriding displayOrderDetails to add tracking info
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    // Overriding displayOrderDetails to add delivery info
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OrderManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take order details
        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();
        System.out.print("Enter Order Date (YYYY-MM-DD): ");
        String orderDate = sc.nextLine();

        // Creating an Order object
        Order order = new Order(orderId, orderDate);
        System.out.println("\nOrder Status:");
        order.displayOrderDetails();
        System.out.println(order.getOrderStatus());

        // Taking shipped order details
        System.out.print("\nEnter Tracking Number: ");
        String trackingNumber = sc.nextLine();

        // Creating a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder(orderId, orderDate, trackingNumber);
        System.out.println("\nShipped Order Status:");
        shippedOrder.displayOrderDetails();
        System.out.println(shippedOrder.getOrderStatus());

        // Taking delivered order details
        System.out.print("\nEnter Delivery Date (YYYY-MM-DD): ");
        String deliveryDate = sc.nextLine();

        // Creating a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);
        System.out.println("\nDelivered Order Status:");
        deliveredOrder.displayOrderDetails();
        System.out.println(deliveredOrder.getOrderStatus());

    }
}


/*
I/P ->
Enter Order ID: 1234
Enter Order Date (YYYY-MM-DD): 2003-11-25

Order Status:
Order ID: 1234
Order Date: 2003-11-25
Order placed on 2003-11-25

Enter Tracking Number: 4567

Shipped Order Status:
Order ID: 1234
Order Date: 2003-11-25
Tracking Number: 4567
Order shipped with tracking number: 4567

Enter Delivery Date (YYYY-MM-DD): 2003-12-2

O/P ->
Delivered Order Status:
Order ID: 1234
Order Date: 2003-11-25
Tracking Number: 4567
Delivery Date: 2003-12-2
Order delivered on 2003-12-2

 */