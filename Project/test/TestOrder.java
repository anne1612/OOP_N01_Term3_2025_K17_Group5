import java.util.Arrays;
import java.util.Scanner;

public class TestOrder {

    // TEST CREATE
    public static void test() {
        System.out.println("\n== TEST CREATE ORDER ==");

        try {
            OrderList manager = new OrderList();

            Order o1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
            o1.setTotalAmount(5000000);
            manager.addOrder(o1);

            Order o2 = new Order("ORD002", "USER002", Arrays.asList(103));
            o2.setTotalAmount(2500000);
            manager.addOrder(o2);

            manager.printAllOrders();
        } catch (Exception e) {
            System.out.println("Lỗi khi tạo đơn hàng: " + e.getMessage());
        }
    }

    // TEST EDIT
    public void testEdit() {
        System.out.println("\n== TEST EDIT ORDER ==");

        try (Scanner sc = new Scanner(System.in)) {
            OrderList manager = new OrderList();
            Order o1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
            o1.setTotalAmount(5000000);
            manager.addOrder(o1);

            System.out.print("Nhập mã đơn hàng cần sửa: ");
            String orderId = sc.nextLine();

            System.out.print("Nhập trạng thái mới: ");
            String newStatus = sc.nextLine();

            manager.editOrderStatus(orderId, newStatus);
            manager.printAllOrders();
        } catch (Exception e) {
            System.out.println("Lỗi khi chỉnh sửa đơn hàng: " + e.getMessage());
        }
    }

    // TEST DELETE
    public void testDelete() {
        System.out.println("\n== TEST DELETE ORDER ==");

        try (Scanner sc = new Scanner(System.in)) {
            OrderList manager = new OrderList();
            Order o1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
            Order o2 = new Order("ORD002", "USER002", Arrays.asList(103));
            manager.addOrder(o1);
            manager.addOrder(o2);

            System.out.print("Nhập mã đơn hàng cần xóa: ");
            String orderId = sc.nextLine();

            manager.deleteOrder(orderId);
            manager.printAllOrders();
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa đơn hàng: " + e.getMessage());
        }
    }
}
