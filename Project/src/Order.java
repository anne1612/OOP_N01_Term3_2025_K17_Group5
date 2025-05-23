import java.time.LocalDate;
import java.util.List;

public class Order {
    private String orderId;
    private String userId;
    private List<Integer> productIds;
    private double totalAmount;
    private LocalDate orderDate;
    private String status;

    // Constructor
    public Order(String orderId, String userId, List<Integer> productIds) {
        this.orderId = orderId;
        this.userId = userId;
        this.productIds = productIds;
        this.orderDate = LocalDate.now();
        this.status = "Chờ xác nhận";
        this.totalAmount = 0;
    }

    // Set tổng tiền
    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    // Cập nhật trạng thái
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Hiển thị thông tin đơn hàng
    public void displayOrderInfo() {
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Mã người dùng: " + userId);
        System.out.println("Danh sách mã sản phẩm: " + productIds);
        System.out.println("Tổng tiền: " + totalAmount + " VND");
        System.out.println("Ngày đặt hàng: " + orderDate);
        System.out.println("Trạng thái: " + status);
    }

    // Getter cho orderId
    public String getOrderId() {
        return orderId;
    }

    // Getter cho userId
    public String getUserId() {
        return userId;
    }

    // Getter cho status
    public String getStatus() {
        return status;
    }

    // Getter cho productIds
    public List<Integer> getProductIds() {
        return productIds;
    }

    // Getter cho tổng tiền
    public double getTotalAmount() {
        return totalAmount;
    }

    // Getter cho ngày đặt hàng
    public LocalDate getOrderDate() {
        return orderDate;
    }
}
