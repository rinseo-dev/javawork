package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_etc02 {

	public static void main(String[] args) {
		// 배열에는 다 같은 타입을 가진 값들만 들어옴.
		char chArr[] = { 'a', 'b', 'c', 'd' };
		String strArr[] = { "홍길동", "kim", "$%^" };
		boolean bArr[] = { true, false, false, true };
		double dArr[] = { 3.14, 7.589, 46.789 }; // double이기때문에 실제 값은 46.0같은 식으로 들어간다고?

		String sArr[] = new String[3];

//		sArr[0] = "아무개";
//		sArr[1] = "강남길";
//		sArr[2] = "이순남"; //이렇게 입력해도 되지만 scanner를 사용해서 입력김

		Scanner scan = new Scanner(System.in);// 계속 사용

		
		  for(int i=0; i<sArr.length; i++) { 
			  System.out.print((i+1) + "번째 이름 입력 : ");//i에 +1을 해야 첫번째부터 나옴
		  
		  //String name = scan.next();
		  //sArr[i] = name; 주석 2줄을 아래 한줄 코딩으로 사용 가능
		  
			  sArr[i] = scan.next();
		  } //for문 밖에서 출력하면 한번에 모두 출력 가능. for문 안에서 출력하면 입력 될 때마다 하나씩 각각 출력됨 
		  
		  for(int i=0; i<sArr.length; i++) { 
			  System.out.print(sArr[i] + ", ");
		  }
		  System.out.println();
		  System.out.println(Arrays.toString(sArr));
		 
		// Arrays(라이브러리)에 들어있는 toString을 호출함. sArr의 값을 [, ,]안에 넣어서 출력해줌
		// for문을 돌려서 출력하지 않아도 Arrays를 사용하면 바로 출력 가능함.(toString이 override되어있음)
		// sysout도 라이브러리

		System.out.println(Arrays.toString(bArr));
		// toString에서 boolean타입을 선택해서 boolean으로 만들어진 배멸 bArr이 먼저 들어온것.수정가능.

		System.out.println(chArr);//char는 배열에 들어있는 실제 값인 문자 하나하나가 다 출력됨.
		//char형은 toString이 override가 되어 있음.
		
		int iArr[] = {1,2,3,4,5};
		System.out.println(iArr);//char를 제외한 타입들은 값이 아니라 '주소'가 출력됨.
		System.out.println(dArr);//주소 출력
		//참조자료형이기때문에 배열에 주소가 들어감. iArr,dArr을 출력하면 주소자체가 출력됨.
		//그래서 toString을 사용하거나 for문으로 실제 값을 출력해야 함. char형인 chArr만 실제 값이 출력됨.
	}

}
