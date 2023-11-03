package list01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList03 {

	public static void main(String[] args) {
		//List<String> list = new LinkedList<String>(); //자식 타입을 부모 타입으로 형변환 한 상태. 이렇게도 사용 가능
		
		//LinkedList<String> list = new LinkedList<String>(); String형으로 받음
		//int형을 받고 싶다면  Wrapper로 integer를 넣어줘야 함.
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		
		list.add(3); //맨 끝에 추가
		list.add(1,5); //(index번호, 넣을 값) 인덱스 번호자리에 추가
		list.addFirst(1); //맨 앞에 추가
		list.addLast(7); //add를 사용하면 무조건 맨 마지막 값에 추가가 돼서 addLast는 잘 쓰지 않음.
		//list.add(인덱스번호,값)으로 특정 인덱스번호에 넣거나, addFirst, addLast 를 통해서 맨 앞에 추가, 뒤에 추가 가능
		
		//제일 처음은 head, 마지막은 tail이라고 함.
		
		for(int i : list) //향상된 for문 list를 i번만큼 돌린다
			System.out.println(i);
		System.out.println("-------------");

		list.remove(); //맨 앞 노드 삭제
		//list.removeFirst(); //맨 앞 노드 삭제
		
		for(int i : list)
			System.out.println(i);
		
		list.remove(1);//특정 인덱스번호 내용 삭제
		list.removeLast();//맨 끝 노드 삭제
		//list.remove(list.size()-1);//맨 끝 노드 삭제
		
		System.out.println("-------------");
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		
		//Iterator : 반복자. 배열과 같은 여러개의 집합으로 이루어진 자료구조를 순회하는 객체
		//list안에 있는 값들을 싹 훑어서 Iterator<>에 넣고 it변수로 사용하는 ..?상태인듯
		Iterator<Integer> it = list.iterator(); //import - util에 있는걸로
		//hesNext() => 남아있는 객체가 있는가?
		//next() => 순회하면서 값 얻어오기
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
	}

}
