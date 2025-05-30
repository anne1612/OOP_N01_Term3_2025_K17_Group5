import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
    
    public void taoDonHangMoi(String userId, ProductList productList, Scanner sc) {
    try {
        List<Integer> selectedProductCodes = new ArrayList<>();
        double total = 0;

        ArrayList<Product> list = productList.st; // hoặc productList.getAll();
        if (list.isEmpty()) {
            System.out.println("⚠️ Không có sản phẩm nào.");
            return;
        }

        while (true) {
            System.out.println("\n📦 Danh sách sản phẩm:");
            for (int i = 0; i < list.size(); i++) {
                Product p = list.get(i);
                System.out.println((i + 1) + ". " + p.getProductName() + " - " + p.getPrice() + " VND (Còn: " + p.getStock() + ")");
            }

            System.out.print("Chọn số thứ tự sản phẩm muốn mua (0 để kết thúc): ");
            int index = Integer.parseInt(sc.nextLine()) - 1;
            if (index == -1) break;

            if (index < 0 || index >= list.size()) {
                System.out.println("❌ Số thứ tự không hợp lệ.");
                continue;
            }

            Product sp = list.get(index);

            System.out.print("Nhập số lượng: ");
            int qty = Integer.parseInt(sc.nextLine().trim());
            if (qty <= 0 || qty > sp.getStock()) {
                System.out.println("❌ Số lượng không hợp lệ.");
                continue;
            }

            sp.updateStock(qty); // trừ hàng
            for (int i = 0; i < qty; i++) {
                selectedProductCodes.add(Integer.parseInt(sp.getProductId())); // giả sử productId là số
            }
            total += sp.getPrice() * qty;
        }

        if (selectedProductCodes.isEmpty()) {
            System.out.println("⚠️ Bạn chưa chọn sản phẩm nào.");
            return;
        }

        String orderId = "ORD" + (new Random().nextInt(900) + 100);
        Order newOrder = new Order(orderId, userId, selectedProductCodes);
        newOrder.setTotalAmount(total);
        addOrder(newOrder);

        System.out.println("✅ Đơn hàng đã được tạo:");
        newOrder.displayOrderInfo();
    } catch (Exception e) {
        System.out.println("Lỗi khi tạo đơn hàng: " + e.getMessage());
    }
}

}

