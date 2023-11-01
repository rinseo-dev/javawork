package exception01;

public class NumberFormat04 { //정수로 변환하라고 했는데 변환할 수 없는 경우 발생

	public static void main(String[] args) {
		String strNum[] = {"23","17","123abc","3.141592"};
						// [0]   [1]   [2]     [3]
		
		int i = 0; //i를 전역으로 빼서 catch문이 실행 될 때 i값을 사용할 수 있게 함.
		try {
			//for문으로 돌려서 int형으로 바꾸시오
			for(i=0; i<strNum.length; i++) {
				int result = Integer.parseInt(strNum[i]); //strNum의 i번째를 찾을 수 있게 됨.
				System.out.println("숫자로 변환된 값: " + result);
			}
			/*
			단, 향상된 for문에서 사용된 num값은 지역변수라서 밖에서 사용 안됨.출력문에서 몇번째부터 오류가 발생했는지 출력하는데어려움. 일반for문은 가능
			//배열이기때문에 일반 for문, 향상된 for문 모두 사용 가능
			for(String num : strNum) { //strNum을 하나씩 가져와서 num에 넣음
				int result = Integer.parseInt(num);
				System.out.println("숫자로 변환된 값: " + result);//이대로 실행되면 23,17만 출력되고, 실수형,문자형->정수형 으로 변환 안돼서 오류발생	
			}
			*/
		}catch(NumberFormatException e){
			//23,17두 값만 숫자형으로 출력되고 나머지는 안됨.
			//어디까지 출력됐고 어디부터 오류가 발생했는지를 보려면 향상된 for문으론 안됨. num이 지역변수가 되므로
			//일반 for문을 통해서 i값을 활용함.
			//System.out.println(i); //2가 출력됨. 인덱스2번부터 숫자로 변경이 안되기 때문. 이걸 이용해서 strNum[i]를 하면 인덱스2번의 값을 가져옴
			
			System.out.println("'"+ strNum[i] + "'는 숫자로 변경 불가");
		}
	}

}
