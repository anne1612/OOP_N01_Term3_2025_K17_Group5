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

        // Danh sách mẫu
        productList.add(new Product("P001", 101, "Laptop Dell", 1500.0, 10, "Laptop hiệu năng cao"));
        productList.add(new Product("P002", 102, "Tai nghe Bluetooth", 250.0, 30, "Chống ồn, pin 40h"));
        productList.add(new Product("P003", 103, "Chuột không dây", 120.0, 20, "DPI 2400, không lag"));

        model.addAttribute("products", productList);
        return "product_list"; // Trả về file product_list.html
    }
}
