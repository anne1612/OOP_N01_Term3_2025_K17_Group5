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

    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void displayOrderInfo() {
        System.out.println(" Ma don hang: " + orderId);
        System.out.println(" Ma nguoi dung: " + userId);
        System.out.println(" Danh sach ma san pham: " + productIds);
        System.out.println(" Tong tien: " + totalAmount + " VND");
        System.out.println(" Ngay dat hang: " + orderDate);
        System.out.println(" Trang thai: " + status);
    }
}
