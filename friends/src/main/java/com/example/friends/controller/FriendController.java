package com.example.friends.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	List<String> friendList = new ArrayList<String>();
	

	@RequestMapping("/index")
	public String index(@RequestParam(value= "friend",  defaultValue = "") String name, Model model) {
		if(name.length() > 0) {
			friendList.add(name);
		}
		model.addAttribute("friends", friendList);
		return "index";
	}
}