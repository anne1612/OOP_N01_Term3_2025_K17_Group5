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

    // UPDATE (đổi tên cho khớp với TestOrder)
    public boolean editOrderStatus(String orderId, String newStatus) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                order.updateStatus(newStatus); // đảm bảo class Order có hàm này
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deleteOrder(String orderId) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId().equals(orderId)) {
                orders.remove(i);
                return true;
            }
        }
        return false;
    }

    // (Optional) Getter để dùng trong Test nếu cần
    public ArrayList<Order> getAllOrders() {
        return orders;
    }
}
