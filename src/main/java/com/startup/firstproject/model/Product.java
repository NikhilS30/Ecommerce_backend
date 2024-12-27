package com.startup.firstproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModal {
	private String title;
	private double price;
	private Category category;

}
