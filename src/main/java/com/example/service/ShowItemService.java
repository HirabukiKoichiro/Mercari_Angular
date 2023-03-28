package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemsRepository;

@Service
public class ShowItemService {
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	public List<Item> itemList() {
		return itemsRepository.findBy30();
	}

}
