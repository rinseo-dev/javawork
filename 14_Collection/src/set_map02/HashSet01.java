package set_map02;

import java.util.*;

public class HashSet01 {
	public static void main(String[] args) {
		//hashSet의 부모는 Set, 더 상위는 Object
		//Object <-상속- Set <>-상속- HashSet
		//그래서 HashSet은 Set, Object 뭘로 받아도 상관없음.
		Object[] objArr = {"1","2","2","3","3","3","4","4","4","4"};
		//add로 넣어도 되지만 그냥 배열로 만듦.
		
		//부모의 자료형인 Set에 new HashSet
		Set set1 = new HashSet();//import 둘 다 util이라 util.*가능
		//Set은 중복값을 두지 않고, Map은 키+값을 모두 저장(?)
		/*
		아래처럼 값을 넣을 걸 for문으로 돌릴 것
		set1.add(objArr[0]);
		set1.add(objArr[1]);
		*/
		for(Object obj : objArr) { //objArr배열에 있는 값 하나씩 가져와서 obj에넣기
			set1.add(obj);
		}
		
		System.out.println("set의 길이 : " + set1.size());//출력값4
		//set은 요소를 허용하지 않는 자료구조여서 중복된 요소가 저장되지 않음.
		//그래서 중복된 값들을 제거하고 유일한 값만 저장하는 set1이 생김.
		//set1.size()를 호출하면 중복이 제거된 요소의 개수인 4가 출력됨
		System.out.println(set1);//set1이 toString으로 오버라이딩 된 상태라 값이 출력됨.
	}
}
