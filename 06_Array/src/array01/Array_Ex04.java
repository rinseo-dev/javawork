package array01;

import java.util.Arrays;

public class Array_Ex04 {

	public static void main(String[] args) {

		int arr1[] = new int[10];
		
		//랜덤으로 1~10까지의 숫자를 배열에 채우기
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=(int)(Math.random() * 10) + 1;
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
