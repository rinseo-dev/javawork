package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch09 {

	public static void main(String[] args) {
		try {
			String[] strNum = {"3","4","a123"}; //이걸 int형으로 바꾸라고 하면 오류 발생함.
			int num = Integer.parseInt(strNum[2]);//NumberFormatException 오류 발생
			System.out.println(strNum[4]);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력 : ");
			int num2 = scan.nextInt();
			
		//catch문이 여러개 일때는 예외처리가 위에서부터 순서대로 내려가면서 일치하는 exception을 찾는다
			//Exception문을 제일 위에 두면 모든것에 적용되므로 각각의 문제점을 파악하기 어렵게 됨.
			//Exception은 무조건 다른 조건들보다 뒤에 배치해야 함.
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 범위를 넘어섰습니다");
		}catch(InputMismatchException e) {
			System.out.println("입력값은 정수로 넣으세요");
		}catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다");
		}catch(Exception e) { //여러개의 catch를 넣을 때 Exception은 제일 마지막에 넣어줘야함.
			System.out.println(e);
		}
		/*	
			//or를 사용해서 표현하는 경우 이 중에 하나만 참이어도 참임 or 하지만 잘사용되지 않음.
		}catch(ArrayIndexOutOfBoundsException|InputMismatchException|NumberFormatException e){
			System.out.println(e);
		}
		*/
	}

}
