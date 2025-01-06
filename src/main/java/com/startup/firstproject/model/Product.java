package com.startup.firstproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModal {
	private String title;
	private double price;
	private Category category;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
