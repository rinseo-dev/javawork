package list01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		 ArrayList<객체> 형식으로 생성함. <>안에 객체를 안넣어도 오류는 나지 않지만 명시해주는게 나음.
		 <>안에 들어가는 값을 generic이라고 함
		 <제네릭> => 자료형이 무엇이 들어올 지 모름, 사용할 때 자료형을 넣음
		 - 개수를 지정하지 않으면 기본10개로 만들어짐
		*/
		
		//개수 지정 가능
		ArrayList<String> alist = new ArrayList<>(15);//개수 15개 지정
		
		//부모형으로 변환하여 사용
		List<String> list = new ArrayList<>();
		list.add("Java"); //String형으로 만듦
		list.add("Oracle");
		list.add("HTML5");
		list.add("JSP");
		
		//ArrayList의 길이는 length()가 아니라 size()
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		//인덱스번호 2번만 출력하고 싶은 경우, 해당 인덱스번호의 객체를 얻어와야함.
		String list2 = list.get(2);//배열이긴 하지만 list의 정체성을 가지므로 list[2]처럼 배열로 불러오기 하지 않음
		System.out.println("index[2]의 값 : " + list2);
		
		//삽입
		list.add(2, "Spring"); //인덱스 2번 자리에 추가가 돼서 인덱스0~4까지인 리스트가 됨.
		System.out.println("총 객체 수 : " + list.size());
		System.out.println("index[2]의 값 : " + list.get(2));
		
		//기존 객체 변경
		//set은 지정 인덱스 자리에 값을 덮어쓰기로 넣는 것
		list.set(2, "SpringBoot"); //set이므로 전체 리스트의 개수는 늘지 않음.
		System.out.println("총 객체 수 : " + list.size());
		System.out.println("index[2]의 값 : " + list.get(2));
		
		System.out.println("---------------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //toString으로 오버라이딩 되어 있어서 문자 그대로 출력됨
		}
		
		System.out.println("===============");
		//삭제 remove(index), remove(객체명)
		String removeStr = list.remove(0); //0번자리인 Java가 지워짐
		System.out.println(removeStr);//무엇을 지워졌는지 확인.
		
		
		System.out.println("-----삭제 후 리스트 출력-----"); //0번인 Java가 삭제되고 Oracle이 0번이 됨
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		boolean re = list.remove("HTML5"); //존재하는 건 삭제되고 true반환됨. "HTML"처럼 없는 객체를 삭제하려는 경우는 false
		System.out.println(re);//삭제 됐으므로 true반환
		
		System.out.println("----- 리스트 clear -----");
		list.clear();//
		System.out.println("총 객체 수 : " + list.size());
		System.out.println("ArrayList가 비어있는가? " + list.isEmpty());
		
		//매개변수에 모든 객체를 받을 때 - <Object> 
		ArrayList alist2 = new ArrayList();// 원래는 ArrayList<>로 <>안에 어떤 자료형을 받을건지 넣어줘야함.
		
		alist2.add(1); //정수를 넣으면 자동으로 integer.parseInt로 객체가 들어감.
		alist2.add(3.1415);
		alist2.add("56");
		alist2.add(new String("88"));
		
		//원래 list값들이 Object형이었음. 변경
		Object obj1 = alist2.get(0);//alist에 여러가지 자료형이 들어가있으므로 Object로 받음.
		int num = (int)obj1;
		double douNum = (double)alist2.get(1);
		int strNum1 = Integer.parseInt((String)alist2.get(2)); //int형에 넣기 위해서 Object->String->int 로 형변환 한 것
		int strNum2 = Integer.parseInt((String)alist2.get(3));
		System.out.println(num+douNum+strNum1+strNum2); //자료들을 int와 double로 형변환해서 더하기 한 상태, 더 큰 자료형이 double이라 최종값이 double
		//큰 자료형으로 자동 형변환
		//객체를 int형으로 바꾸는 unboxing이 발생함.
	}

}
