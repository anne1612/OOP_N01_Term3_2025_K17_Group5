package com.example.order_check.controller;

import com.example.order_check.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/list")
    public String getAllProducts(Model model) {
        List<Product> productList = new ArrayList<>();
        
        try {
            // Danh sách mẫu
            productList.add(new Product("P001", 101, "Laptop Dell", 1500.0, 10, "Laptop hiệu năng cao"));
            productList.add(new Product("P002", 102, "Tai nghe Bluetooth", 250.0, 30, "Chống ồn, pin 40h"));
            productList.add(new Product("P003", 103, "Chuột không dây", 120.0, 20, "DPI 2400, không lag"));

            model.addAttribute("products", productList);
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi khi tạo danh sách sản phẩm: " + e.getMessage());
            e.printStackTrace(); // In chi tiết lỗi nếu cần
        } finally {
            System.out.println("⚙️ Hoàn tất xử lý danh sách sản phẩm.");
        }

        return "product_list"; // Trả về view dù có lỗi hay không (Spring xử lý view lỗi nếu cần)
    }
}
