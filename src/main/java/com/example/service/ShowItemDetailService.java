package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Item;
import com.example.repository.ItemsRepository;

@Service
@Transactional
public class ShowItemDetailService {
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	public Item getItem(Integer id) {
		return itemsRepository.load(id);
	}

}
