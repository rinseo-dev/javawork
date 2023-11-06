package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
	        System.out.println("1. 새 도서 추가");
	        System.out.println("2. 도서 전체 조회");
	        System.out.println("3. 도서 검색 조회");
	        System.out.println("4. 도서 삭제");
	        System.out.println("5. 도서 명 오름차순 정렬");
	        System.out.println("9. 종료");
	        
	        System.out.print("메뉴 번호 선택 : ");
	        int num = sc.nextInt();//scanner로 받은 숫자를 넣어줄 num
	        sc.nextLine();//줄을 지워줌(?) 개행처리
	        System.out.println();
	        
	        switch(num) {
	        case 1:
        		insertBook();
        		break;
        	case 2:
        		selectList();
        		break;
        	case 3:
        		searchBook();
        		break;
        	case 4:
        		deleteBook();
        		break;
        	case 5:
        		ascBook();
        		break;
	        case 9:
	        	System.out.println("프로그램을 종료합니다");
	        	return; // return해주면 method자체가 끝남.
	        default:
	        	System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
	        }//switch
		}
		
	}
	private void ascBook() { //전체조회를 해보면 정렬되어있지않았지만, 5번눌러서 ascBook()실행하고 나면 정렬된 기준으로 나옴.
		int num = bc.ascBook();
		if(num ==1) {
			System.out.println("정렬에 성공하였습니다.");
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력 해주세요.");
		System.out.print("도서명 입력 : ");
		String title = sc.nextLine();
		System.out.print("저자명 입력 : ");
		String author = sc.nextLine();
		System.out.print("장르 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int categoryNum = sc.nextInt();
		System.out.println("가격 입력 : ");	
		int price = sc.nextInt();
		//여기는 2개가 nextInt로 들어와서 sc.nextLine();를 안해줘도 된다고 함.
		
		String category = null;
		switch(categoryNum) {
			case 1:
				category = "인문";
				break;
			case 2:
				category = "자연과학";
				break;
			case 3:
				category = "의료";
				break;
			default:
				category = "기타";
		}//switch
		
		//BookController에 있는 insertBook(Book book)을 호출해야 bookList.add(book);가 리턴되면서 리스트에 입력됨
//		Book newBook  = new Book(title,author,category,price);
//		bc.insertBook(newBook);
		
		bc.insertBook(new Book(title,author,category,price));// 위 두 줄을 한 줄로 써도 됨.
	}
	
	public void selectList() { //전체 리스트를 가져옴. / 컨트롤러에 반환형이 ArrayList<Book>
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> bookList = bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("도서가 없습니다");
		}else {
			for(Book book : bookList) {
				System.out.println("\t"+book); //book을 출력하면  toString된 book이 출력됨.
			}
		}
	}
	
	//사용자로부터 받아서 컨트롤러에 있는걸 호출
	public void searchBook() { //searchBook도 ArrayList로 반환됨
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다");
		}else {
			for(Book book : searchList) {
				System.out.println("\t"+book);
			}
		}
	}
	
	public void deleteBook() { //반환형이 Book. List로 받지 않음
		System.out.println("===== 도서 삭 제=====");
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자 명");
		String author = sc.nextLine();
		
		Book book  = bc.deleteBook(title, author);
		if(book == null) { //컨트롤러에서 book에 null값이 넘어온 경우
			System.out.println("삭제할 도서가 없습니다");
		}else {
			System.out.println(book + "을 삭제하였습니다"); //book에 toString이 넘어옴
		}
		

	}

	

	

	
}
