// src/OrderManager.java
import java.util.ArrayList;

public class OrderManager {

    private final ArrayList<Order> orders = new ArrayList<>();

    // CREATE
    public void addOrder(Order order) {
        orders.add(order);
    }

    // READ
    public void printAllOrders() {
        for (Order order : orders) {
            order.displayOrderInfo();
            System.out.println("---------------");
        }
    }

    // UPDATE
    public boolean updateOrderStatus(String orderId, String newStatus) {
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {
                order.updateStatus(newStatus);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deleteOrder(String orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId().equals(orderId)) {
                orders.remove(i);
                return true;
            }
        }
        return false;
    }
}
