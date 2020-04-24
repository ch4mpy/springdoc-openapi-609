package com.github.ch4mpy.springdoc609.web.dto;

import org.springframework.hateoas.RepresentationModel;

public class ItemDto extends RepresentationModel<ItemDto> {

	private final String boCode;

	public ItemDto(String boCode) {
		super();
		this.boCode = boCode;
	}

	public String getBoCode() {
		return boCode;
	}

}
