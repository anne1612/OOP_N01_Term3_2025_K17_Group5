package com.example.servingwebcontent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.servingwebcontent.database.orderAiven;
import com.example.servingwebcontent.database.userAiven;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.example.servingwebcontent.model.Order;
import com.example.servingwebcontent.model.User;

//controller to order list
@Controller
public class OrderListController {
    @GetMapping("/orderlist")
	public String orderlist(Model model) {

		ArrayList<Order> listOfOrder = new ArrayList<Order>();
		orderAiven oa = new orderAiven();
		listOfOrder = oa.orderAivenList();

		model.addAttribute("listOfOrder", listOfOrder);

		return "orderlist";
	}

    
    /* Cô Thu
    public String orderlist(Model model, @RequestParam String userId){

        System.out.println("user id:" + userId);

        ArrayList<Order> orderList = new ArrayList<Order>();
        orderAiven sa = new orderAiven();
        orderList = sa.orderAivenList();
        model.addAttribute("ListOfOrder", orderList);

        return "orderlist";

    }*/

    

    @GetMapping("/ordersearch")
    public String orderSearch(@RequestParam(name = "userId", required = false) String userId, Model model) {
        System.out.println("Received userId: " + userId);
        ArrayList<Order> orderSearch = new ArrayList<Order>();
        orderAiven oa = new orderAiven();

        // Nếu userId được nhập thì lọc theo userId
        if (userId != null && !userId.isEmpty()) {
            orderSearch = oa.orderListByUserId(userId);  // 🟢 Hàm cần viết thêm trong orderAiven
        } else {
            orderSearch = oa.orderAivenList();  // 🟡 Nếu không nhập thì hiển thị tất cả
        }

        model.addAttribute("orderSearch", orderSearch);

        return "ordersearch"; //trả về đường dẫn

    }
    
}
