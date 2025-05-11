import java.time.LocalDate;

public class Order {
    private String orderId;
    private String userId;
    private String productId;   // Danh sách ID sản phẩm dạng chuỗi: "1,2,3"
    private double totalAmount;
    private LocalDate orderDate;
    private String status;

    public Order(String orderId, String userId, String productId) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
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
        System.out.println(" Danh sach ma san pham: " + productId);
        System.out.println(" Tong tien: " + totalAmount + " VND");
        System.out.println(" Ngay dat hang: " + orderDate);
        System.out.println(" Trang thai: " + status);
    }
}
