package com.example.servingwebcontent.controller;
import com.example.servingwebcontent.database.userAiven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import com.example.servingwebcontent.model.User;


@Controller
public class UserListController {

	@GetMapping("/userlist")
	public String userlist(Model model) {

		ArrayList<User> listOfArray = new ArrayList<User>();
		userAiven ua = new userAiven();
		listOfArray = ua.userAivenList();

		model.addAttribute("listOfArray", listOfArray);

		return "userlist";
	}

}