package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.AddItem;

@RestController
@RequestMapping("/add")
public class AddItemController {
	
	@ResponseBody
	@CrossOrigin(
			origins = "http://localhost:4200", 
			methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.OPTIONS,RequestMethod.TRACE,RequestMethod.PATCH,},
			allowCredentials = "true"
			)
	@PostMapping("")
	public void addItem(@RequestBody AddItem item) {
		System.out.println("Angularから受け取ったデータ" + item);
	}

}
