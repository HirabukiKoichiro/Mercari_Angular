package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Category;
import com.example.repository.CategoryRepository;

@Service
@Transactional
public class SelectBoxService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> bigCategoryList() {
		return categoryRepository.findByBigCategory();
	}
	
	public List<Category> mediumCategoryList(Integer id) {
		return categoryRepository.findByMediumCategoryId(id);
	}
	
	public List<Category> smallCategoryList(Integer id) {
		return categoryRepository.findBySmallCategoryId(id);
	}
	
	
	
	

}
