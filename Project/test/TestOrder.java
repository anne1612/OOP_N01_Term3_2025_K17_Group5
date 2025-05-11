import java.util.Arrays;

public class TestOrder {
    public static void main(String[] args) {
        // Create product and order sample
        Product product = new Product(101, 10, "Smartphone", 5000000, 50, "High-end smartphone");
        product.displayProductInfo();

        // Create an order with a list of product IDs
        Order order = new Order("ORD001", "USER123", Arrays.asList(101, 102));
        order.setTotalAmount(5000000 * 2);

        System.out.println("\n THONG TIN DON HANG:");
        order.displayOrderInfo();

        // Update order status
        order.updateStatus("Đang giao");

        System.out.println("\n Sau khi cap nhat trang thai:");
        order.displayOrderInfo();
    }
}
