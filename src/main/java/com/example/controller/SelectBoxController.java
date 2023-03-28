package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Category;
import com.example.service.SelectBoxService;

@Controller
@RequestMapping("/selectbox")
public class SelectBoxController {

	@Autowired
	private SelectBoxService selectBoxService;

	@GetMapping("/big")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200", methods = { RequestMethod.GET }, allowCredentials = "true")
	public List<Category> getBigCategory() {
		List<Category> bigCategoryList = selectBoxService.bigCategoryList();
		return bigCategoryList;
	}
	
	@GetMapping("/medium")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:4200", methods = { RequestMethod.GET }, allowCredentials = "true")
	public List<Category> getMidiumCategory(@RequestParam("id") Integer id) {
		List<Category> midiumCategoryList = selectBoxService.mediumCategoryList(id);
		return midiumCategoryList;
	}
	
	@GetMapping("/small")
	@ResponseBody
	@CrossOrigin(
			origins = "http://localhost:4200", 
			methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,RequestMethod.OPTIONS,RequestMethod.TRACE,RequestMethod.PATCH,},
			allowCredentials = "true")
	public List<Category> getSmallCategory(Integer id) {
		List<Category> smallCategoryList = selectBoxService.smallCategoryList(id);
		return smallCategoryList;
	}
	

}
