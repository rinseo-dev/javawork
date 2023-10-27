package com.addinedu.model.vo;

import java.util.Scanner;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Book객체를 넣을 배열 3개
		Book[] books = new Book[2];//객체생성이 아니라 배열을 3개 생성
		//Book이라는 배열을 만들었을 때 books는 stack에 올라옴

		for(int i=0;i<books.length; i++){//배열에 넣을거라 인덱스0번부터 시작
			System.out.println(i+1+"번째 도서 정보 입력");

			System.out.print("도서명 입력 : ");
			String title = scan.nextLine();
			System.out.print("저자 입력 : ");
			String author = scan.nextLine();
			System.out.print("가격 입력 : ");
			int price = scan.nextInt();
			scan.nextLine();
			System.out.print("출판사 입력 : ");
			String publisher = scan.nextLine();
			
			//배열에 객체 입력
			books[i] = new Book(title,author,price,publisher);
			System.out.println(books[i].information());
			
			//위 처럼 입력 하면 아래 for문을 받아서 출력할 필요 없음
//			for(int i=0; i<books.length; i++) {
//				System.out.println(books[i].information());
//			}
		}
		
		//도서 제목으로 검색
		System.out.println("검색할 책 제목 : ");
		String search = scan.nextLine();
		
		for(int i=0;i<books.length;i++) {
			if(books[i].getTitle().equals(search))
				System.out.println(books[i].information());
		}
		
		
	}
		

}
