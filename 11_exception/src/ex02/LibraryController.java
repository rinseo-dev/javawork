package ex02;

import java.util.ArrayList;

public class LibraryController {

	Member mem;
	ArrayList bList;
	
	void insertMember(Member mem) {
		this.mem = mem;//챗
	}
	
	Member myInfo(){
		return mem; //여기서 왜 return이 mem일까
	}
	
//	public void selectAll(){
//		ArrayList<Book> bList = new ArrayList<Book>();
//	}
	
	//챗
	public ArrayList<Book> selectAll(){
		return bList;
	}
	
	/*
	public void searchBook(String keyword) {
		ArrayList<Book> bList = new ArrayList<Book>();
	}
	*/
	
	//챗
	public ArrayList<Book> searchBook(String keyword){
		return bList;
	}
	
	int rentBook(int index) {
		return 1;
	}
}
