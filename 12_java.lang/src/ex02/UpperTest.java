package ex02;

import java.util.Scanner;

public class UpperTest {

	public static void main(String[] args) {
		boolean flag = false;
		
		System.out.println("1.모든 문자를 대문자로 변환");
		System.out.println("2문자열에서 문자가 몇번 출현하는지 횟수 반환");
		System.out.println("3.글자 변경하기(a->t)");
		System.out.println("0.프로그램 끝내기");
		System.out.println("-----------------------------------");
		
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 입력 : ");
			String text = sc.next();
			
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			
				switch(num) {
				case 1: String upp = text.toUpperCase();
						System.out.println(upp);
						break;
						
				case 2: int cnt = text.length();
						System.out.println(cnt);
						break;
						
				case 3: String rp = text.replace('a', 't');
						System.out.println(rp);
						break;
						
				case 0: flag=true;
						break;
				}
			if(flag == true) {
				System.out.println("프로그램 끝내기");
				break;
			}
		}
	}

}
