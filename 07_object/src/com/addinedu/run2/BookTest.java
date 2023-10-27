package com.addinedu.run2;

import com.addinedu.model.vo2.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book bk1 = new Book("혼공자바",30000,0.05,"김자반");
		Book bk2 = new Book();
		
		System.out.println(bk1.information());
		
		
		bk2.setTitle("혼공SQL");
		bk2.setPrice(25000);
		bk2.setDiscountRate(0.07);
		bk2.setAuthor("이큐엘");
		System.out.println(bk2.information());

		//getter로 값 가져오기
		System.out.println("할인된 가격 = "+(bk1.getPrice()-(bk1.getPrice()*bk1.getDiscountRate())));
		
		System.out.println("할인된 가격2 = "+(bk2.getPrice()-(bk2.getPrice()*bk2.getDiscountRate())));
	}

}
