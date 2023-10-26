package objTv06;

import java.util.Scanner;

public class TvTest {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		//System.in이 생성자.
		//sc1도 객체인 Scanner(System.in) 생성해서 사용하는 것.
		//단, 스캐너는 이미 만들어져있는 클래스(?)를 가져와서 사용하는거라 임포트해야함
		
		int num[] = new int[10];
		//이것 역시 int형(int[10])의 객체 생성해서 사용하는 것.
		
		Tv tv1 = new Tv();
		
		System.out.println("-----TV정보-----");
		System.out.println("회사명 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println("인치 : " + tv1.inch);
		System.out.println("---------------");
		
		tv1.power();
		
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelDown());
		
		System.out.println("현재 볼륨 : " + tv1.volume(15));
		System.out.println("현재 볼륨 : " + tv1.volume(10));
		
		System.out.println("현재 채널 : " + tv1.channelDown());
		
		tv1.power();

	}

}
