package com.github.ch4mpy.springdoc609.web;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ch4mpy.springdoc609.domain.Item;
import com.github.ch4mpy.springdoc609.web.dto.ItemDto;

@RequestMapping(path = "/items")
@RestController()
public class ItemController {

	private final ItemRepository itemRepo;
	private final ItemAssembler itemAssembler;
	private final PagedResourcesAssembler<Item> pagedItemsAssembler;

	@Autowired
	public ItemController(
			ItemRepository itemRepo,
			ItemAssembler itemAssembler,
			PagedResourcesAssembler<Item> pagedItemsAssembler) {
		super();
		this.itemRepo = itemRepo;
		this.itemAssembler = itemAssembler;
		this.pagedItemsAssembler = pagedItemsAssembler;
	}

	@GetMapping
	public ResponseEntity<PagedModel<ItemDto>> getPage(Pageable pageable) {
		final var itemPage = itemRepo.findPage(pageable);
		return ok(pagedItemsAssembler.toModel(itemPage, itemAssembler));
	}
}
