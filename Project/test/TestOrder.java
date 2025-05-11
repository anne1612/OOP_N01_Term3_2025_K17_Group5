
public class TestOrder {
    public static void main(String[] args) {
        // Tạo đơn hàng mẫu
        Order order = new Order("ORD001", "USER123", "PROD456");
        order.setTotalAmount(999000); // Giả sử tổng tiền

        System.out.println(" THÔNG TIN ĐƠN HÀNG:");
        order.displayOrderInfo();

        // Cập nhật trạng thái
        order.updateStatus("Đang giao");

        System.out.println("\n Sau khi cập nhật trạng thái:");
        order.displayOrderInfo();
    }
}
