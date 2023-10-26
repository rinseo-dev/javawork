package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_copy08 {

	public static void main(String[] args) {
		
		int[] oldScore = {90, 87, 69, 97, 100}; // = int[5]
		//score[5] = 68; 배열은 5개지만 index번호로 따지면 0~4번이므로 이렇게 하면 오류

		int[] newScore = new int[10];
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i];
			//기존에 있던 oldScroe값을 newScore에 넣어주는 과정.
		}
		
		newScore[5] = 78;
		System.out.println(Arrays.toString(newScore));
		//0~4번은 있는 값을 불러오고, 5번은 78을 새로 넣어줌.
		//newScore 배열은 총 10개지만 oldScore에는 4개 값 뿐이므로, 추가된 78을 제외한 나머지는 값은 0으로 표시됨.
		
		
		//System.arraycopy(oldScore, 0, newScore, 0, oldScore.length);
		System.arraycopy(oldScore, 1, newScore, 3,4); // 0,0,0,87,69,97,100,0,0,0 이렇게 나옴
						//어느 배열을, 인덱스 몇번부터, 새로운배열에, 새배열인덱스몇개부터, 몇개를 집어넣을건지
						//oldScore배열 중, index 1번부터, newScore배열의, index3번부터, 4개값을 넣을 것
		
		//for문을 주석처리 한 상태로 arraycopy를 작업하면 
		System.out.println(Arrays.toString(newScore));
		
		String oldStr[] = {"java", "python", "oracle"};
		String newStr[] = new String[10];
		
		System.arraycopy(oldStr, 0, newStr, 2, 3); //인덱스 2번부터 3개까지 oldStr이 출력되는건가?
					   //원본배열, 원본배열의시작인덱스번호, 붙여넣을배열, 붙여넣을배열 인덱스 번호, 복사할개수
					   //oldStr에 있는 0번부터의 자료를 newStr배열에 인덱스2번부터 3개까지 복사(?)
		System.out.println(Arrays.toString(newStr));
		
	
	}

}
