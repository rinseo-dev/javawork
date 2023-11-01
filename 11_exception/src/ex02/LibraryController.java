package ex02;

import java.util.ArrayList;

public class LibraryController {

	private Member mem = new Member();
	
	private ArrayList<Book> bList = new ArrayList<Book>();//책 정보를 넣을 때 멤버처럼 사용.
	
	//사용자에게서 값을 받고 싶으면 scanner를 사용해주면 됨.
	
	//이게 쌤 답 - 사람은 1명이고 book이 여러개인 경우로 만듦
	public void insertMember(Member m) { //m값은 스캐너나 생성자로 넘겨주기
		this.mem = m;
	}
	
	public void myInfo(){
		System.out.println(mem);
	}//toString이 있으니까 입력된 정보를 출력만
	
	
	public void insertBook() {//Book()에 있는 생성자 사용해서 값 입력
		bList.add(new Book("java","신용권","한빛미디어"));
		bList.add(new Book("oracle","아무개","DBi"));
		bList.add(new Book("spring","홍길동","스프링"));
	}//bList에 값을 넣은 상태.
	
	public ArrayList<Book> selectAll() {//반환형은 ArrayList가 됨.
		return bList; 
	}
	
	public Book searchBook(String keyword) {
		Book book = null;//for문에서 사용할 것. for문을 돌고 검색한 책이 존재하면 book에 넣어줌.
		
		for(int i = 0; i<bList.size(); i++) {//ArrayList는 length가 아니라 size		
			if(bList.isEmpty()) {//bList가 비어있다면
				System.out.println("책이 없습니다");
				break; //책이 없는경우 문구 출력하고 정지
			}else if(keyword.equals(bList.get(i).getTitle())) { //Book에 필드 private 선언하고, getter/setter만들어서 가져옴.
				//Array처럼 index번호가 있는게 아니므로 get(i)로 값을 가져옴. [i]아님
				//Book b1 = bList.get(i); 이렇게 하나하나 선언해도 되지만 아래처럼 바로 ()안에 넣어도 됨.
				book = bList.get(i);
				break;
				
				//Book에서 필드를 private로 생성했으면 getter/setter가 필요하고,
				//아닌 경우는 title이 keyword와 같은지만 확인하는 방식.
			}
		}
		return book;
	}
	
	public int rentBook(int index) {
		return index;
	}
	
}
