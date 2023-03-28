package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Item;
import com.example.service.ShowItemService;

@Controller
@RequestMapping("/list")
public class ShowItemListController {

	@Autowired
	private ShowItemService showItemService;

	@GetMapping("")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST})
	public List<Item> itemList() {
		List<Item> itemList = showItemService.itemList();
		return itemList;
	}

}
