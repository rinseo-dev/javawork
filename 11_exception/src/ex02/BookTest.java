package ex02;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		LibraryController lc = new LibraryController();//사용할 컨트롤러 가져옴
		
		lc.insertBook();
		ArrayList<Book> bList = lc.selectAll(); //selectAll을 변수 ArrayList에 저장해야됨. Book목록을 다 가져오므로
		//System.out.println(bList.get(0));//bList에 Book에 대한 주소가 들어가있지만 toString으로 오버라이딩 해서 값이 호출됨
		
		for(int i=0; i<bList.size(); i++){//전체 리스트를 불러오기 하기 위해 for문으로 돌림
			System.out.println(bList.get(i));
		}
		
		//Member mem = new Member("김수연",23,'남');//mem에 값을 바로 넣어줌 //char는 ''로 입력해야되나봄 ""하니까 오류남.
		//lc.insertMember(mem); //mem값을 받아서 Member.java에 필드값에 넣어줌
		lc.insertMember(new Member("김수연",23,'남'));//바로 위 두줄을 이렇게 한줄로 해결 가능.
		lc.myInfo();//void고 출력구문이 메서드에 존재함.
		
		Book searchBook = lc.searchBook("java"); //이렇게 찾고 나면 반환값 Book에 넣어줌.컨트롤러에 searchBook의 반환값이 Book임
		//searchBook을 했는데 null이 발생했을 경우로 if만들어줌.
		if(searchBook == null) {
			System.out.println("찾는 책이 없습니다");
		}else {
			System.out.println(searchBook);//이렇게 출력하면 오버라이딩된 toString이 호출됨.
		}//try-catch로도 가능함. nullPointException이 발생한다면~으로
		
		int index =lc.rentBook(5); //5까지 값이 존재하지 않는데 index값을 가져오면 오류 발생함. if문으로 해결해서 예외메세지가 뜨지 않게 함.
		
		if(index < bList.size()) {
			System.out.println("-----빌려주는 책 정보-----");
			System.out.println(bList.get(index));
			System.out.println("책을 대여함");
		}else {
			System.out.println("책이 없습니다");
		}//try-catch로도 가능함.
	}
}
