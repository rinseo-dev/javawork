package set_map02;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet07 {

	public static void main(String[] args) {
		int[] arrInt = {1,4,3,6,7,1,6,4,6,8}; //10개 중 중복 4개
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(Integer o : arrInt) {
			ts.add(o);
		}
		
		System.out.println(Arrays.toString(arrInt));
		System.out.println("오름차순 정렬(기본값) : " + ts); //오름차순 정렬로 출력(기본값)
		//로또번호를 TreeSet으로 출력하면 자동으로 오름차순 정렬되니까 더 편함.
		
		//내림차순 정렬 : descendingSet
		NavigableSet<Integer> descend = ts.descendingSet();
		System.out.println("내림차순 정렬 : " + descend);
		
	}
}
