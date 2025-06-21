package com.example.servingwebcontent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.servingwebcontent.database.orderAiven;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.example.servingwebcontent.model.Order;

//controller to order list
@Controller
public class OrderListController {
    @GetMapping("/orderlist")

    public String orderlist(@RequestParam(name = "userId", required = false) String userId, Model model) {
        ArrayList<Order> orderList = new ArrayList<Order>();
        orderAiven oa = new orderAiven();

        // Nếu userId được nhập thì lọc theo userId
        if (userId != null && !userId.isEmpty()) {
            orderList = oa.orderListByUserId(userId);  // 🟢 Hàm cần viết thêm trong orderAiven
        } else {
            orderList = oa.orderAivenList();  // 🟡 Nếu không nhập thì hiển thị tất cả
        }

        model.addAttribute("ListOfOrder", orderList);

        //data to View is ${ListOfOrder}
        
       //return view is songList
        return "orderlist";

    }

    @GetMapping("/ordersearch")
    public String orderSearchPage(Model model) {
        return "ordersearch";  // Trả về file ordersearch.html trong templates
    }
    
}
