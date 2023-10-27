package com.addinedu.model.vo;

public class Book {
	//도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	//생성자
	public Book() {
	}
	
	//매개변수가 4개인 생성자
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	//getter/setter 메서드 생성
	public String getTitle() {
		return title;
	}
	//setter는 전역변수에 값을 넣는 것. 반환형이 필요 없음
	public void setTitle(String title) {
		this.title = title;//title에 값 넣기
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String publisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//모든 필드 값을 반환하는 메서드
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}
}
