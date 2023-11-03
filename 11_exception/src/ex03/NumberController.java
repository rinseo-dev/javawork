package ex03;

public class NumberController {
	public boolean check(int num1, int num2) throws NumRangeException {
		//if문이 true면 NumberRangeException으로 날림
		if(num1 < 1 || num1 > 100 || num2 < 1 || num2 >100) {
			throw new NumRangeException("1~100사이 값만 입력할 수 있음");
		}
			
		return num1 % num2 == 0;
	}
}
