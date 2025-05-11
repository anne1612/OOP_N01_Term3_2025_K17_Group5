

import java.time.LocalDate;

public class Payment {
    private int paymentId;
    private int orderId;
    private double amount;
    private String method;
    private String status;
    private LocalDate paymentDate;

    public Payment(int paymentId, int orderId, double amount, String method, String status, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.method = method;
        this.status = status;
        this.paymentDate = paymentDate;
    }

    public void processPayment() {
        this.status = "Đã thanh toán";
        this.paymentDate = LocalDate.now();
        System.out.println("Thanh toán thành công.");
    }

    public void displayPaymentInfo() {
        System.out.println("Ma thanh toan: " + paymentId);
        System.out.println("Ma don hang: " + orderId);
        System.out.println("So tien: " + amount);
        System.out.println("Phuong thuc: " + method);
        System.out.println("Trang thai: " + status);
        System.out.println("Ngay thanh toan: " + paymentDate);
    }

    public void updateMethod(String newMethod) {
        this.method = newMethod;
        System.out.println("Cap nhat phuong thuc thanh toan thanh cong.");
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Cap nhat trang thai thanh toan thanh cong.");
    }
}