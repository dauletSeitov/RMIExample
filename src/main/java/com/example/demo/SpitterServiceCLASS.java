package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SpitterServiceCLASS implements SpitterService{

	String name = "default";
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String str) {
		name =str;
	}

}
