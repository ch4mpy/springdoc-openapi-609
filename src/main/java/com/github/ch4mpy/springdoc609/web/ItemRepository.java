package com.github.ch4mpy.springdoc609.web;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.github.ch4mpy.springdoc609.domain.Item;

@Component
public class ItemRepository {
	private static final List<Item> stubItems = List.of(new Item("ABC001"), new Item("ABC002"), new Item("ABC003"));

	public Page<Item> findPage(Pageable pageable) {
		return new PageImpl<>(stubItems);
	}
}