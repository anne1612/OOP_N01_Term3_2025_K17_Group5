import java.time.LocalDate;

public class Order {
    private String orderId;
    private String userId;
    private String productId;
    private double totalAmount;
    private LocalDate orderDate;
    private String status;

    public Order(String orderId, String userId, String productId) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.orderDate = LocalDate.now();
        this.status = "Chờ xác nhận";
    }
}