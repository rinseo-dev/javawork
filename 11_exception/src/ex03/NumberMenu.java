package ex03;

import java.util.Scanner;

public class NumberMenu {

	public void menu() {
	/*NumberController nc = new NumberController();
			
		try {
			boolean result = nc.check(num1, num2);
			System.out.println(num1 +"은(는)" + num2 + "의 배수인가?" + result);
		} catch (NumRangeException e) {
			System.out.println(e.getMessage());
		}
	*/
		NumberController nc = new NumberController();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num1 입력: ");
		int num1 = scan.nextInt();
		
		System.out.println("num2 입력: ");
		int num2 = scan.nextInt();
		
		try {
			boolean result = nc.check(num1, num2);
			System.out.println(num1 +"은(는)" + num2 + "의 배수인가?" + result);
		} catch (NumRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
