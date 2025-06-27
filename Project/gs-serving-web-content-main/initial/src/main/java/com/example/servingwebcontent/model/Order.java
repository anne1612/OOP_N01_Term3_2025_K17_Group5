package com.example.servingwebcontent.model;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private String orderID;
    private LocalDate orderDate;
    private String status;

    public Order(String orderID) {
        try {
            this.orderID = orderID;
            this.orderDate = LocalDate.now();
            this.status = "Pending";
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi khi khởi tạo đơn hàng: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định khi tạo đơn hàng: " + e.getMessage());
        }
    }

    public Order() {}

    /*public void setTotalAmount(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Tổng tiền không được âm.");
            }
            this.totalAmount = amount;
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định khi cập nhật tổng tiền: " + e.getMessage());
        }
    }*/


       // Getter cho orderID
    public String getOrderID() {
        return orderID;
    }

    // Setter cho orderID
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    // Getter cho orderDate
    public LocalDate getOrderDate() {
        return orderDate;
    }

    // Setter cho orderDate
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    // Getter cho status
    public String getStatus() {
        return status;
    }

    // Setter cho status
    public void setStatus(String status) {
        this.status = status;
    }
 

    /*public void setProductIds(List<Integer> productIds) {
    try {
        if (productIds == null || productIds.isEmpty()) {
            throw new IllegalArgumentException("Danh sách sản phẩm không được để trống.");
        }
        this.productIds = productIds;
    } catch (IllegalArgumentException e) {
        System.out.println("Lỗi khi cập nhật danh sách sản phẩm: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Lỗi không xác định khi cập nhật danh sách sản phẩm: " + e.getMessage());
    }
    }*/


    public void updateStatus(String newStatus) {
        try {
            this.status = newStatus;
        } catch (Exception e) {
            System.out.println("Lỗi khi cập nhật trạng thái: " + e.getMessage());
        }
    }

    public void displayOrderInfo() {
        try {
            System.out.println("Mã đơn hàng: " + orderID);
            //System.out.println("Mã người dùng: " + userId);
            //System.out.println("Danh sách mã sản phẩm: " + productIds);
            //System.out.println("Tổng tiền: " + totalAmount + " VND");
            System.out.println("Ngày đặt hàng: " + orderDate);
            System.out.println("Trạng thái: " + status);
        } catch (Exception e) {
            System.out.println("Lỗi khi hiển thị đơn hàng: " + e.getMessage());
        }
    }



}
