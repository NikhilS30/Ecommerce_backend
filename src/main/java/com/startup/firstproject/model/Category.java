package com.startup.firstproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category extends BaseModal{
	private String name;
	private String desc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
