package exception01;

import java.util.Arrays;

public class ArrayIndexOutOfBounds03 { //배열에서 범위를 넘어갔을 때 발생하는 예외에 대한 예제.

	public static void main(String[] args) {
		String str[] = {"a","b","c","e"}; //index 0,1,2,3가 존재하는 상태
		try {
			//오류가 발생할 수 있는 구문을 try안에 넣어줌.
			System.out.println(str[5]); //이것도 오류. 인덱스 3번까지 있음.
			str[4] = "d"; //Index 4 out of bounds for length 4 길이가 4인데 index를 4를 써서 오류가 발생 index는 0번부터라 3번이 네번째임.
		}catch(ArrayIndexOutOfBoundsException e){//변수이름은 e가 아니어도 됨
			//예외처리 발생시 실행될 내용을 적어줌
			System.out.println("배열의 범위를 넘었습니다 index는 " + (str.length-1) + "까지만 사용 가능");//총 배열 개수는 4개지만 인덱스는 3번까지 이므로 -1
							//문자열+숫자+문자열의 형태로 사용하면 모든걸 문자열로 인식하게 되므로 연산에 대한 오류가 발생함. 연산을 위해서 ()괄호를 쳐줘야 함.
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(str)); //str의 값이 출력되도록 toString으로 오버라이딩됨
	}

}
