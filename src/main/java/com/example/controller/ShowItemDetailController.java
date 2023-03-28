package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Item;
import com.example.service.ShowItemDetailService;

@Controller
@RequestMapping("/detail")
public class ShowItemDetailController {
	
	@Autowired
	private ShowItemDetailService showItemDetailService;
	
	@GetMapping("")
	@ResponseBody
	@CrossOrigin(
			origins = "http://localhost:4200", 
			methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.OPTIONS,RequestMethod.TRACE,RequestMethod.PATCH,},
			allowCredentials = "true"
			)
	public Item shoItemDetail(Integer id) {
		Item item = showItemDetailService.getItem(id);
		System.out.println("itemの中身！" + item);
		return item;
	}

}
