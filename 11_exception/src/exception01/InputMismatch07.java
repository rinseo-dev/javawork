package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch07 { //입력할 때 자료형이 다르면 발생

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 3개 입력하세요");
		
		int sum = 0;
		for(int i=1; i<=3; i++) {
			System.out.println(i + "번째 점수 : ");
			
			//try-catch는 오류가 발생할 지점에만 해도 됨
			try {
				//int형으로 받아야 int형에 넣을 수 있음.
				int num = scan.nextInt();//단어 단위로 들어가기때문에 enter가 다음 순번에 같이 들어가게 됨. 방지위해서 밑에 scan.enxt(); 챗지피티한테물어보기..
				sum += num;
			}catch(InputMismatchException e) {//InputMismatchException는 util에 있어서 import필요
				System.out.println("정수가 아닙니다 다시 입력하세요");
				 scan.next();//nextInt()에서 enter친걸 다시 돌려줘야함.
				i--; //잘못 입력된 순번으로 돌아감.
			}
		}
		//try-catch문 바깥에 있는건 예외가 발생하든 안하든 실행됨
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/3.0);
	}

}
