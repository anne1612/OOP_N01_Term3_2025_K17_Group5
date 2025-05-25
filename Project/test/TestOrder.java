import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestOrder {

    // Danh sách đơn hàng mẫu
    public static void test() {
        System.out.println("\n== TEST CREATE ORDER ==");

        OrderManager manager = new OrderManager();

        // Tạo đơn hàng
        Order o1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
        o1.setTotalAmount(5000000);
        manager.addOrder(o1);

        Order o2 = new Order("ORD002", "USER002", Arrays.asList(103));
        o2.setTotalAmount(2500000);
        manager.addOrder(o2);

        // In danh sách đơn hàng
        manager.printAllOrders();
    }

    public void testEdit() {
        System.out.println("\n== TEST EDIT ORDER ==");

        OrderManager manager = new OrderManager();
        Order o1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
        o1.setTotalAmount(5000000);
        manager.addOrder(o1);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã đơn hàng cần sửa: ");
        String orderId = sc.nextLine();
        System.out.print("Nhập trạng thái mới: ");
        String newStatus = sc.nextLine();

        manager.editOrderStatus(orderId, newStatus);
        manager.printAllOrders();
    }

    public void testDelete() {
        System.out.println("\n== TEST DELETE ORDER ==");

        OrderManager manager = new OrderManager();
        Order o1 = new Order("ORD001", "USER001", Arrays.asList(101, 102));
        Order o2 = new Order("ORD002", "USER002", Arrays.asList(103));
        manager.addOrder(o1);
        manager.addOrder(o2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã đơn hàng cần xóa: ");
        String orderId = sc.nextLine();

        manager.deleteOrder(orderId);
        manager.printAllOrders();
    }
}
