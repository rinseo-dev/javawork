package exDocument14;

//라이브러리
class Document{//public은 한 곳에만 넣을 수 있으므로 class로 작성
	
	static int count; //초기값 0인 상태
	//static은 공동으로 사용되니까 몇개가 되든 호출이 된다고..?
	
	String name;//변수 지정
	
	Document(){//문서에 제목을 넣지 않은 것 하나
		this("제목없음" + ++count); //첫 생성에는 제목없음1, 2, 3.. 계속 늘어감. "제목없음"이 name에 들어가는듯?
	}
	
	Document(String name){//문서명을 넣은 것 하나
		//객체 생성할 때 받은 값을 넣을 곳(?)
		this.name = name;//this.name은 변수 지정된 name
		System.out.println("문서 " + this.name + " 생성됨");
	}
	
}
//main이 있는 실행class
public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.java");
		Document d3 = new Document();
		Document d4 = new Document();
	}

}
