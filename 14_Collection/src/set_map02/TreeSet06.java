package set_map02;

import java.util.TreeSet;

public class TreeSet06 {

	public static void main(String[] args) {
		
		//Tree가 붙으면 sort가 된 상태로 값이 들어감 - Tree구조
		//출력도 순서대로 됨.
		
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(100);
		scores.add(93);
		scores.add(74);
		scores.add(58);
		
		//int score = scores.first();
		System.out.println("가장 낮은 점수 : " + scores.first()); //가장 낮은 숫자..?
		System.out.println("가장 높은 점수 : " + scores.last()); //100
		
		System.out.println("100점 아래 점수 : " + scores.lower(100)); //93
		System.out.println("84점 보다 위의 점수 : " + scores.higher(87)); //93
		
		System.out.println("74점과 동일한 점수, 없으면 바로 아래 점수 : " + scores.floor(74)); //74
		System.out.println("60점과 동일한 점수, 없으면 바로 아래 점수 : " + scores.floor(60)); //58
		
		 System.out.println("74점과 동일한 점수, 없으면 바로 위의 점수 : " + scores.ceiling(74)); //74
		 System.out.println("93점과 동일한 점수, 없으면 바로 위의 점수 : " + scores.ceiling(90)); //93
		 
		 //매개변수(점수, 본인포함여부 -기본값 flase)
		 System.out.println("87점 보다 낮은 점수들 : " + scores.headSet(87,true));
		 System.out.println("87점 보다 높은 점수들 : " + scores.tailSet(87));
		 
		 //subSet(시작점수, 시작점수 포함여부-기본값true, 끝 점수, 끝점수 포함여부-기본값false)
		 System.out.println("74~100점 사이의 점수들 : " + scores.subSet(74, 100));
		 System.out.println("74~100점 사이의 점수들 : " + scores.subSet(74, false, 100, true));
		 
		/*
		System.out.println("가장 낮은 점수 삭제 : " + scores.pollFirst());
		System.out.println(scores);
		System.out.println("가장 높은 점수 삭제 : " + scores.pollLast());
		System.out.println(scores);
		*/
	}

}
