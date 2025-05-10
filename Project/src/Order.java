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
}