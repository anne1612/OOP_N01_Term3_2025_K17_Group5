import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Order {
    private String orderId;
    private String userId;
    private List<Product> products;
    private double totalAmount;
    private LocalDate orderDate;
    private String status;

    public Order(String orderId, String userId) {
        this.orderId = orderId;
        this.userId = userId;
        this.products = new ArrayList<>();
        this.orderDate = LocalDate.now();
        this.status = "Chờ xác nhận";
    }

    
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getTotalPrice();
    }

    
    public void displayOrder() {
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Khách hàng: " + userId);
        System.out.println("Ngày đặt hàng: " + orderDate);
        System.out.println("Trạng thái đơn hàng: " + status);
        System.out.println("Danh sách sản phẩm:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }
        System.out.println("Tổng tiền: " + totalAmount + " VNĐ");
    }

    // Cập nhật trạng thái đơn hàng
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Tính tổng số tiền
    public double getTotalAmount() {
        return totalAmount;
    }
}