
package com.example.order_check.controller;

import com.example.order_check.model.CustomerOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/paid/{userId}")
    public String getPaidOrders(@PathVariable String userId, Model model) {
        List<CustomerOrder> orders = new ArrayList<>();
        orders.add(new CustomerOrder(userId, "DH001", true));
        orders.add(new CustomerOrder(userId, "DH002", false));
        orders.add(new CustomerOrder(userId, "DH003", true));

        List<CustomerOrder> paidOrders = new ArrayList<>();
        for (CustomerOrder o : orders) {
            if (o.isPaid) paidOrders.add(o);
        }

        model.addAttribute("paidOrders", paidOrders);
        return "paid_orders";
    }
}
