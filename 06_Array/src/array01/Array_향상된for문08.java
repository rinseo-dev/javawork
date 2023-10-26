package array01;

import java.util.Arrays;

public class Array_향상된for문08 {

	public static void main(String[] args) {
		//배열에서만 사용 가능
		//배열의 처음부터 끝까지 사용할 때 활용 가능
		int num[] = {1,2,3,4,5};
		
		
		//배열이 int자료형이므로 같은 int사용
		//무조건 배열을 처음부터 끝까지 순서대로 돌때만 사용 가능. 2,3,4만 출력하기는 불가능. 전체만 가능.
		for(int result : num) {//num에 있는 배열을 하나씩 꺼내서 가져옴.
			System.out.println(result);
			//num배열을 처음부터 끝까지 하나씩 출력하게 됨.
		}
		
		String name[] = {"홍길동", "아무개", "이문열"};
		
		for(String str : name) {
			System.out.println(str);//String배열 처음부터 끝까지 str에 저장해서 출력됨.
		}
		
		System.out.println("--------------------");
		String name2[] = new String[3];
		int index = 0;
		//여기서는 index번호를 사용할 수 없으므로 바깥에 지정해줌
		for(String str2 : name) {
			name2[index++] = str2;
			//System.out.println(str2);//name배열에 있던 값을 index변수로 번호를 주고 name2
			System.out.println(name2[--index]);//str2말고 이렇게도 사용 가능
			//nam2[index++]에서 출력에 name2[--index]를 하게되면 실제 출력은 홍,아,이 다 되지만 배열은 [이문열, null, null]이 됨
			//index-1을 해줘야 index값이 순차적으로 늘면어 배열에 홍,아,이가 들어감.
		}
		System.out.println(Arrays.toString(name2));
		
		System.out.println("--------------------");
		String name3[] = new String[3];
		int index2 = 0;
		//여기서는 index번호를 사용할 수 없으므로 바깥에 지정해줌
		for(String str3 : name) {
			name3[index2++] = str3;
			//System.out.println(str2);//name배열에 있던 값을 index변수로 번호를 주고 name2
			System.out.println(name3[index2-1]);//str2말고 이렇게도 사용 가능
			//nam2[index++]에서 출력에 name2[--index]를 하게되면 실제 출력은 홍,아,이 다 되지만 배열은 [이문열, 0, 0]이 됨
			//index-1을 해줘야 index값이 순차적으로 늘면어 배열에 홍,아,이가 들어감.
		}
		System.out.println(Arrays.toString(name3));

	}

}
