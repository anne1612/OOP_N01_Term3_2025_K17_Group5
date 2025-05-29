import java.util.ArrayList;

public class OrderList {

    private final ArrayList<Order> orders = new ArrayList<>();

    // CREATE
    public void addOrder(Order order) {
        try {
            if (order == null) {
                throw new IllegalArgumentException("Đơn hàng không được null.");
            }
            orders.add(order);
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm đơn hàng: " + e.getMessage());
        }
    }

    // READ
    public void printAllOrders() {
        try {
            if (orders.isEmpty()) {
                System.out.println("Danh sách đơn hàng trống.");
                return;
            }

            for (Order order : orders) {
                order.displayOrderInfo();
                System.out.println("---------------");
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi hiển thị danh sách đơn hàng: " + e.getMessage());
        }
    }

    // UPDATE
    public boolean editOrderStatus(String orderId, String newStatus) {
        try {
            for (Order order : orders) {
                if (order.getOrderId().equals(orderId)) {
                    order.updateStatus(newStatus);
                    return true;
                }
            }
            System.out.println("Không tìm thấy đơn hàng với mã: " + orderId);
        } catch (Exception e) {
            System.out.println("Lỗi khi cập nhật trạng thái đơn hàng: " + e.getMessage());
        }
        return false;
    }

    // DELETE
    public boolean deleteOrder(String orderId) {
        try {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getOrderId().equals(orderId)) {
                    orders.remove(i);
                    return true;
                }
            }
            System.out.println("Không tìm thấy đơn hàng để xóa: " + orderId);
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa đơn hàng: " + e.getMessage());
        }
        return false;
    }

    // Optional getter
    public ArrayList<Order> getAllOrders() {
        return orders;
    }
}
