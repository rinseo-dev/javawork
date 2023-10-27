package com.addinedu.model.vo;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		//복습1.
		Book b1 = new Book(); //객체가 만들어진 주소를 b1에 저장하게 됨.
		//생성자가 빈 것을 호출하면 b1과 연결
		
		//b1의 주소를 통해서 title, author, price, publisher의 값을 불러옴
		b1.setTitle("혼자 공부하는 자바");
		b1.setAuthor("신용권");
		b1.setPrice(24000);
		b1.setPublisher("한빛미디어");

		Book b2 = new Book("마이바티스 프로그래밍","이동국",25000,"에이콘");
		//생성자가 있는 것을 호출하면 b2와 연결
		
		Book b3 = new Book();
		//사용자로부터 입력받아 필드에 값 저장하기
		
		
		//scan.next()//단어 단위로 문자열을 받음
		//scan.nextInt()//줄단위로 문자열을 받음
		//scan.nextLine()//int형으로 받음
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("도서명 입력 : ");
		//String title = scan.next();
		//b3.setTitle(title);//사용자로부터 받은 값을 set을 통해 title에 넣음
		//nextLine을 쓰면 줄 단위로 입력되지만 next는 단어 단위이므로 띄어쓰기를 하면 구분이 되어버림
		//next()에 "불친절한 sql프로그래밍"을 입력하면 title에 불친절한을 받고 저자에 sql프로그래밍을 받게 되는 것.
		b3.setTitle(scan.nextLine());//한줄로도 가능.
		System.out.print("저자 입력 : ");
		b3.setAuthor(scan.nextLine());
		System.out.print("가격 입력 : ");
		b3.setPrice(scan.nextInt());
		scan.nextLine();//next()를 사용할 때는 상관 없고, nextLine()을 사용할 때 필요
		//nextLine은 줄단위로 받지만 int도 단어 단위로 받게 되므로 nextLine을 통해 새 줄로 넘어가야 함.
		//아닌 경우 출판사 입력 하기 전에 다음 라인으로 넘어가지 못해서 콘솔이 끝나버렸음..
		System.out.print("출판사 입력 : ");
		b3.setPublisher(scan.nextLine());
		
		
//		 b3.setPrice(scan.nextInt());
//		 b3.setPublisher(scan.next());
//		 이렇게 구성하면 scan.nextLine()안넣어도 가능
//		 
		
		System.out.println(b3.getTitle());
		
		////
		System.out.print("도서명 입력 : ");
		String title2 = scan.nextLine();
		System.out.print("저자 입력 : ");
		String author2 = scan.nextLine();
		System.out.print("가격 입력 : ");
		int price2 = scan.nextInt();
		System.out.print("출판사 입력 : ");
		String publisher2 = scan.next();
		
		
		Book b4 = new Book(title2,author2,price2,publisher2);
		//이렇게 사용자 입력을 받은 값을 b4에 저장하는 방법도 있음.
		
		
		
		//일반 변수에 3권의 책을 입력
		//변수를 입력해서 사용하면 일일이 모든 구문을 입력해서 사용해야 함.
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		
		for(int i=1; i<=3; i++) {
			System.out.print("도서명 입력 : ");
			String title = scan.nextLine();
			System.out.print("저자 입력 : ");
			String author = scan.nextLine();
			System.out.print("가격 입력 : ");
			int price = scan.nextInt();
			System.out.print("출판사 입력 : ");
			String publisher = scan.next();
			
			//매번 검사 - 총 3개라 3번만 돌면 됨. 개수가 늘어나면..너무 
			if(i==1) {//1과 같으면 book1
				book1 = new Book(title,author,price,publisher);
			}else if(i==2){//2와 같으면 book2
				book2 = new Book(title,author,price,publisher);
			}else {
				book3 = new Book(title,author,price,publisher);
			}
			
			//출력도 일일이 하나씩 다 해줘야함.
			System.out.println(book1.information());
			System.out.println(book2.information());
			System.out.println(book3.information());
			
			
		//검색용으로 만들어서 사용했음.
//		Book book1 = new Book("혼공자","신용권",35000,"한빛미디어");
//		Book book2 = new Book("마이바티스 프로그래밍","이동국",25000,"에이콘");
//		Book book3 = new Book("oracle","정희락",20000,"DBian");
			//도서 제목으로 검색
			System.out.println("검색할 책 제목 : ");
			String search = scan.nextLine();
			
			//getter에는 아무것도 안받음 getTitle()인 상태.
			if(book1.getTitle().equals(search)) {//사용자 입력값(search)과 getTitle이 같으면
				System.out.println(book1.information());
			}else if(book2.getTitle().equals(search)){
				System.out.println(book2.information());
				
			}else {
				System.out.println(book3.information());
			}
		}
	}

}
