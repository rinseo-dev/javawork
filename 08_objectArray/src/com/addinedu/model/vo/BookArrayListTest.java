package com.addinedu.model.vo;

//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;//이렇게 한줄로 지정도 가능. 같은 util이니까

public class BookArrayListTest {

	public static void main(String[] args) {
		//여기서는 배열 대신 ArrayList를 사용
		//ArrayList는 라이브러리고 객체만 넣을 수 있음.초기값은 10개짜리 배열이 생성됨
		//ArrayList는 개수가 늘어나면 새로운 주소지를 포함함

		Scanner scan = new Scanner(System.in);
		ArrayList<Book> al = new ArrayList<Book>();
		
		System.out.print("도서명 입력 : ");
		String title = scan.nextLine();
		System.out.print("저자 입력 : ");
		String author = scan.nextLine();
		System.out.print("가격 입력 : ");
		int price = scan.nextInt();
		scan.nextLine();
		System.out.print("출판사 입력 : ");
		String publisher = scan.nextLine();
		
		//al.add(new Book("","",5,"")); 객체 생성해서 add해주면 사용할 수 있음
		Book b1 = new Book(title,author,price,publisher);
		
		al.add(b1);//b1이 가리키고 있는 주소
		//b1에 add된 값을 넣는거겠지..?
	}

}
