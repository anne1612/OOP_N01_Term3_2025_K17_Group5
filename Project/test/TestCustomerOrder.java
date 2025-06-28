import java.util.Scanner;
import java.util.ArrayList;

public class TestCustomerOrder {
public static void test() {
ListCustomerOrder orderList = new ListCustomerOrder();

// Thêm vài đơn hàng mẫu
orderList.addObject(new CustomerOrder("u01", "od001", true));
orderList.addObject(new CustomerOrder("u01", "od002", false));
orderList.addObject(new CustomerOrder("u02", "od003", true));

// Nhập từ bàn phím
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập User ID: ");
String inputUserId = scanner.nextLine();

ArrayList<CustomerOrder> chek = orderList.filterCustomerOrderByUserId(inputUserId);
if (chek.isEmpty()) {
System.out.println("Không tìm thấy đơn hàng cho user: " + inputUserId);
} else {
System.out.println("Đơn hàng của user " + inputUserId + ":");
for (CustomerOrder c : chek) {
System.out.println("Order ID: " + c.orderId);
}
}

scanner.close();
}
// Lọc và hiển thị đơn hàng đã thanh toán
/*ArrayList<CustomerOrder> paidOrders = orderList.getPaidOrdersByUser(inputUserId);

if (paidOrders.isEmpty()) {
System.out.println("Không tìm thấy đơn hàng đã thanh toán cho user: " + inputUserId);
} else {
System.out.println("Đơn hàng đã thanh toán của user " + inputUserId + ":");
for (CustomerOrder c : paidOrders) {
System.out.println("Order ID: " + c.orderId);
}
}

scanner.close();
}*/
}