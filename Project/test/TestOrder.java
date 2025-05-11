import java.util.Arrays;

public class TestOrder {
    public static void main() {

        // Create an order with a list of product IDs
        Order order = new Order("ORD001", "USER123", Arrays.asList(101, 102));
        order.setTotalAmount(5000000 * 2);

        System.out.println("\n Thông tin đơn hàng:");
        order.displayOrderInfo();

        // Update order status
        order.updateStatus("Đang giao");

        System.out.println("\n Sau khi cập nhật trạng thái:");
        order.displayOrderInfo();
    }
}
