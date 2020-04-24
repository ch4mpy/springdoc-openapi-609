package com.github.ch4mpy.springdoc609.domain;

public class Item {

	private final Long id;

	private String boCode;

	public Item(String boCode) {
		super();
		this.id = null;
		this.boCode = boCode;
	}

	Item() {
		this(null);
	}

	public String getBoCode() {
		return boCode;
	}

	public void setBoCode(String boCode) {
		this.boCode = boCode;
	}

	public Long getId() {
		return id;
	}
}
