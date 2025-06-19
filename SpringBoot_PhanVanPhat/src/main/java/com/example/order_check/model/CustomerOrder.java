
package com.example.order_check.model;

public class CustomerOrder {
    public String userId;
    public String orderId;
    public boolean isPaid;

    public CustomerOrder(String userId, String orderId, boolean isPaid) {
        this.userId = userId;
        this.orderId = orderId;
        this.isPaid = isPaid;
    }

    public void displayCustomerOrder() {
        System.out.println("User ID: " + userId);
        System.out.println("Order ID: " + orderId);
    }
}
