package system03;

import java.util.Scanner;

public class System06 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long startNano = System.nanoTime();
		
		for(int i=1; i<1000; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		long endTime = System.currentTimeMillis();
		long endNano = System.nanoTime();
		
		//시간이 얼마나 걸렸는지 표시: 끝난시간 - 시작시간
		System.out.println(endTime-startTime);
		System.out.println(endNano-startNano);
		
		Scanner sc = new Scanner(System.in);
	}
}
