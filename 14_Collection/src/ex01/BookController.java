package ex01;

import java.util.*;

public class BookController {
	//List<Book> bookList = new ArrayList<Book>(); //list안하고 ArrayList<Book>로 해도 됨.
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	BookController(){
		//add에 객체 생성해서 넣어줌.
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","다니엘","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
	}
	
	public void insertBook(Book book) { //insert니가 bookList애 넣어줘야함.
		bookList.add(book);		
	}
	
	public ArrayList<Book> selectList(){
		return bookList;
	}

	public ArrayList<Book> searchBook(String keyword){ //책 제목에서 keyword가 있는지 검색해서 ArrayList로 반환
		ArrayList<Book> searchList = new ArrayList<Book>(); //searchList는 객체만 생성되어 있고 텅 빈 상태.
		
		//리스트 목록을 돌면서 찾아야하므로 for문
		for(Book book : bookList) { //bookList에서 검색해야 함.
			if(book.getTitle().contains(keyword)) { //title에 키워드가 포함되어 있는지
				searchList.add(book); //else가 없으면 안넣어도 됨		
			}
		}
		return searchList;//searchList에 들어가있는 값으로 return
	}
	
	public Book deleteBook(String title, String author) { //삭제를 하려면 검색이 필요
		Book book = null; //book = bookList.remove(i);이 값이 있는지 null인지가 BookMenu로 감.
		
		//향상된 for문을 사용하면 index번호를 사용할 수 없으므로 일반 for문
		for(int i=0; i<bookList.size(); i++) {
			// get(i)번째를 가져와서 비교.
			if(title.equals(bookList.get(i).getTitle()) && author.equals(bookList.get(i).getAuthor())) {
				book = bookList.remove(i); //remove에 index를 넣어주면 반환형 ArratyLisyㄹ호 반환형. Object를 넣으면 T/F반환형.
				break; //같은 책을 하나 찾고나면 break로 빠져나오기 / 동명의 책&동명이인의 작가가 없다는 전제로
			}
		}
		return book;
	}
	
	
	//정렬 추가함
	public int ascBook() {
		bookList.sort(null);
		return 1;
	}
}
