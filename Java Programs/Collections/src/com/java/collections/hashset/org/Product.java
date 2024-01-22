package com.java.collections.hashset.org;

public class Product {
	
	private	int id;
	private	String name;
	private	float price;

	public Product() {
		//default constructor
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
