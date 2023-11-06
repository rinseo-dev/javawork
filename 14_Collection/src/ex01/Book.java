package ex01;

import java.util.Objects;
				//implements Comparable넣어주고 구현되지 않은 것 add unimplements로 구현해줌.
public class Book implements Comparable<Book>{//<Book>이라고 명시해줌. Comparable만 명시하면 상위인 Object를 받게 되므로 자식타입으로 형변환해서 사용해야 함.
	String title;
	String author;
	String category;
	int price;
	
	public Book() {}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}

	@Override
	public boolean equals(Object obj) { //아래 주석보다 간단하게 표현한 구문
		if(obj instanceof Book) { //Book으로 만들어졌다면,
			Book b = (Book)obj;
			return (author.equals(b.author))
					&& (category.equals(b.category))
					&& (price == b.price)
					&& (title.equals(b.title));
		}
		return false; //else값을 return으로 받게 해도 됨. if문 안에서 true가 나오니까
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
		*/
	}

	//기존에 구현하라고 하지는 않았지만 수업하면서 추가되는 것\
	/*
	 * 이렇게 작성되면 Book을 사용할 때 형변환이 필요하게 됨.
	@Override
	public int compareTo(Object o) {
		return 0;
	}
	*/
	
	/*
	 * 특정 필드를 기준으로 정수값 반환
	 * - 기준 값이 정수 일때
	 * 	 this.price < o.price => -1
	 * 	 this.price == o.price => 0
	 *   this.price > o.price => 1
	 *   
	 * - 문자열 일때
	 * 	 문자가 같을 때 => 0
	 *   다를 때 => 음수 또는 양수
	 */
	@Override //implements Comparable<Book>로 명시하면 자식으로 형변환 없이 바로 Book을 사용할 수 있음
	public int compareTo(Book o) {
		//숫자일 때
		//return this.getPrice() - o.getPrice();
		//내 클래스 안에서 접근하면 오류가 발생하지 않지만, 직접 접근 보다 get메서드 사용하는게 좋음
		
		//문자열 비교할 때
		return this.getTitle().compareTo(o.getTitle());//문자열을 비교할 때 compareTo사용해도 됨 오버라이딩 되어 있으므로.
		//list안에 있는 걸 오름차순 정렬을 해준다고..?
	}	
	
}
