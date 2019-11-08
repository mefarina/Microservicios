package com.example.demo.item.models.service;

import java.util.List;

import com.example.demo.item.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}