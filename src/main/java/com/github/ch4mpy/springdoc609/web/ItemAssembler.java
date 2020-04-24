package com.github.ch4mpy.springdoc609.web;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import com.github.ch4mpy.springdoc609.domain.Item;
import com.github.ch4mpy.springdoc609.web.dto.ItemDto;

@Component
public class ItemAssembler extends RepresentationModelAssemblerSupport<Item, ItemDto> {

	public ItemAssembler() {
		super(ItemController.class, ItemDto.class);
	}

	@Override
	protected ItemDto instantiateModel(Item entity) {
		return new ItemDto(entity.getBoCode());
	}

	@Override
	public ItemDto toModel(Item entity) {
		return createModelWithId(entity.getBoCode(), entity);
	}

}
