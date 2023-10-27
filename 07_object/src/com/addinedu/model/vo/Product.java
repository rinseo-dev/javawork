package com.addinedu.model.vo;

public class Product {
	//필드
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//생성자
	public Product(){
		
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	//information() - String
	public String information() {
		return productId + ", " + productName + ", " + productArea + ", " + price + ", " + tax;
	}
	
	
	//getter,setter
	public void setProduct(String productId) {
		this.productId = productId;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getTax() {
		//return tax;
		return 0.05;
	}
	
	
}
