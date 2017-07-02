package com.wajahat.learn.spring.core;

public class Triangle {

	private String type;



	public void draw() {
		System.out.println(getType() + " Triangle Drawn");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
