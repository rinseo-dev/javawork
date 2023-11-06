package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		BookMenu bMenu =  new BookMenu();
		bMenu.mainMenu();
		
		
		/* 
		 * 컬렉션 정렬
		 * - 클래스별로 기본정렬(오름차순 정렬) : sort
		 * - 내림차순 정렬 : comparator구현 클래스 작성이 필요
		 */
		//아래는 설명과 예시들.
		//ArrayList<Integer> List = new ArrayList<Integer>();
		/*
		List<Integer> list = new ArrayList<Integer>();//List로도 가능
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		System.out.println("정렬 전 : " + list);
		
		//list.sort(null), Collection을 사용한 정렬방법 두가지 
		list.sort(null);//첫번째 방법
		//Collections.sort(list);//두번째 방법 / s가 꼭 붙어야함.
		System.out.println("정렬 후 : " + list);
		
		
		
		//Comparator<Integer> comp = Collections.reverseOrder();
		//list.sort(comp);
		
		list.sort(Collections.reverseOrder());//위 두줄을 한 줄로 작성함.
		System.out.println("내림차순 정렬 후 : " + list);
		System.out.println("--------------------");
		
		List<String> strList = new ArrayList<String>();//String자료형은 사전순으로 정렬됨
		strList.add("이길동");
		strList.add("홍길동");
		strList.add("김길동");
		strList.add("박길동");
		strList.add("남길동");
		
		System.out.println("정렬 전 : " + strList);
		
		strList.sort(null);
		System.out.println("정렬 후 : " + strList);
		
		System.out.println("--------------------");
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","다니엘","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
		
		System.out.println("정렬 전 : " + bookList);//toString으로 출력됨
		
		
		//Arrays.sort를 사용할 수 없다는 예외 발생. Comparable를 만들어야 한다고 나옴.
		//Book에는 여러개의 필드가 있어서 그 중에 어떤 필드를 기준으로 정렬할 것인지를 정해야 함.
		//bookList.sort(null);
		//System.out.println("정렬 후 : " + bookList);
		
		
		//Book애서 compareTo()만듦.
		//book타입에서 compareTo()를 불러와서 반환값인 this.getTitle().compareTo(o.getTitle());를 사용함.
		Collections.sort(bookList);
		System.out.println("정렬 후 : " +  bookList);
		
		bookList.sort(Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + bookList);
		*/
		
		/*
		 strList.sort(null);
		System.out.println("정렬 후 : " + strList); 설명
		
		 Java에서 `List`의 `sort` 메서드를 호출할 때 `null`을 전달하는 이유는
		해당 메서드의 오버로드된 버전 중 하나를 선택하고 싶을 때입니다.
		`List`의 `sort` 메서드는 다음 두 버전으로 오버로드되어 있습니다:
		
		1. `void sort(Comparator<? super E> c)`: 이 메서드는
		리스트를 주어진 `Comparator` 객체를 사용하여 정렬합니다.
		`Comparator` 객체는 두 요소를 비교하는 방법을 정의합니다.
		
		2. `void sort(null)`: 이 메서드는 리스트를 요소 자체의 자연 순서
		또는 요소가 `Comparable` 인터페이스를 구현한 경우
		해당 요소의 `compareTo` 메서드를 사용하여 정렬합니다.
		
		`null`을 전달하면 Java는 어떤 버전의 `sort` 메서드를 사용할지 결정합니다.
		만약 리스트의 요소들이 `Comparable` 인터페이스를 구현하고 있다면
		`null`을 전달하면 요소의 자연 순서를 기반으로 정렬됩니다.
		그렇지 않으면 `NullPointerException`이 발생할 수 있으므로 주의해야 합니다.
		
		따라서 `strList.sort(null);` 코드는 `strList`의 요소가 
		`Comparable` 인터페이스를 구현하거나 `strList`가 
		`Comparable` 요소로 구성된 리스트인 경우 사용할 수 있습니다. 
		그렇지 않으면 `null`을 전달하는 대신 명시적으로 `Comparator` 객체를 전달해야 합니다.
		 */
	}

}
