package ex03;

public class NumberMenu {

	public void menu(int num1, int num2) {
	NumberController nc = new NumberController();
			
		try {
			boolean result = nc.check(num1, num2);
			System.out.println(num1 +"은(는)" + num2 + "의 배수인가?" + result);
		} catch (NumRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
