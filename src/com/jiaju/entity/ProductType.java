package com.jiaju.entity;

public class ProductType {
	private int id ;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductType() {
		
	}
	public ProductType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProductType [id=" + id + ", name=" + name + "]";
	}
	
	
}
