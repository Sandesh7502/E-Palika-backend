package com.ePallika.sample.address.model.dto;

public class ProvinceDto {

	private long id;
	private String name;
	private String nameNep;
	
	private long value;
	private String label;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameNep() {
		return nameNep;
	}

	public void setNameNep(String nameNep) {
		this.nameNep = nameNep;
	}

}
