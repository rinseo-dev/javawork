package ex02;

//Book, Member는 java bean이라고 보면 됨.

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	Book(){
	}
	
	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	//객체생성한 이름만 호출해도 Book에 입력된 정보가 나오게 
	@Override //오버라이딩 추가
	public String toString() {
		return "제목 : " + title + ", 저자 : " + author + ", 출판사 : " +  publisher;
	}

}
