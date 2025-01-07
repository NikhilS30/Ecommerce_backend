package com.startup.firstproject.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionHandlerDTO {
	private String msg;
	private String solution;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}

}
