package string04;

import java.util.Arrays;
import java.util.Scanner;

public class String07 {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //byte = 8bit
		//bytes인 배열값을 String에 넣으면 숫자 하나하나가 나와야함.
		//문자에 해당하는 유니코드를 받아와서 넘겨줌.
		//그래서 아래 구문으로 출력하면 'Hello Java'라는 문자가 출력됨.
		String str = new String(bytes); 
		System.out.println(str);
		
						//(객체,시작 index번호, 개수)
		String str2 = new String(bytes, 6, 4); //bytes에서 인덱스6번부터 4글자까지를 str2에 넣음
		System.out.println(str2);
		
		//index에 해당하는 문자 하나 얻어오기
		//문자열에서 특정 글자만 뽑아내기 charAt()
		String str3 = "abcdefg";
		char ch = str3.charAt(3); //str3에서 인덱스번호 3번째 문자 가져오기
		System.out.println(ch);
		
		//문자 대문자로 변환
		String upperCase = str3.toUpperCase();
		System.out.println(upperCase);
		
		
		//몇번에서 cd가 시작되는지, d가 있는지를 보는 것이므로 int형
		int indexCD = str3.indexOf("cd"); //인덱스번호 2번부터 cd가 나오므로 2
		int indexD = str3.indexOf('d'); //문자 하나는 외따옴표/인덱스번호 3번이 d이므로 3
		
		System.out.println(indexCD);
		System.out.println(indexD); //이 방식으로 주민번호 1,3은 남자 2,4는 여자를 찾을 수 있음
		
		String bookName = "자바 프로그램";
		//문자, 문자열이 시작하는 index번호 반환(-1이면 없는 글자) , indexOf도 오버로딩이 되어있어서 문자'', 문자열"" 모두 가능
		if(bookName.indexOf("자바") > -1) //"자바"가 있다는 의미의 식. -1보다 크면 있다는 의미니까
			System.out.println("자바 책 입니다");
		else
			System.out.println("자바 책이 아닙니다");
		
		//str3에서 F를 찾아서 있으면 "F학점입니다"출력
		int indexF = str3.indexOf('f');
		if(indexF !=0)
			System.out.println("F학점입니다");
		else
			System.out.println("F학점이 아닙니다");
		
		//concat(String) : 2개의 문자열 연결
		String str4 = "java";
		String str5 = str4.concat(" program");
		String str6 = str4 + " program";
		System.out.println(str5); 
		System.out.println(str4 + " program");//굳이 concat을 사용하지 않아도 문자열을 합쳐서 표현할 방법이 많아서 잘 사용하지 않음
		
		//contains(charSequence s) - contains도 오버로딩이 되어 있음
		boolean re = str6.contains("java");//str6에 "java"가 포함되어 있나? -> 반환값 T/F 저장 boolean으로 해야함.
		System.out.println(re);//true
		
		//replace(char old, char newChar) : 글자를 변경하여 문자열로 반환
		System.out.println(str5.replace('a', 'e')); //str5에 있는 a라는 글자를 e로 고치기. 반환형 String이라 바로 출력도 가능
		//출력값 : jeve progrem
		
		//split(String regex, int limit) : regex를 기준으로 나누어 배열로 반환
		String str7 = "Cat/Dog/Hamster/Bear";
		String[] strArr = str7.split("/");
		System.out.println(Arrays.toString(strArr));// /가 있는 단위로 나누어진다음 배열 형식으로 출력됨.
		System.out.println(strArr[1]);
		
		String[] strArr2 = str7.split("/", 3);// /를 기준으로 3개로 나누기. 3개 1개로 나뉘어지게 됨. /로 나눈것 3개 인가봄.
		System.out.println(Arrays.toString(strArr2));
		System.out.println(strArr2[2]);
		
		//substring(int startIndex, int endIndex) : index를 기준으로 그 뒤의 글자를 가져와서 문자열로 반환
		//index번호를 넣는 경우 맨 끝은 포함되지 않는 경우가 많음. endIndex는 포함하지않음
		String str8 = "JavaOracleSpringBoot";
		
		//반환형이 있으므로 바로 출력 가능
		System.out.println(str8.substring(4,10));//출력물 Oracle / 인덱스 4번부터 9번까지를 가져옴.
		System.out.println(str8.substring(4));//출력물 OracleSpringBoot / 번호가 하나면 index번호부터 끝까지 모두를 포함.
		
		//사용자로부터 주민번호123456-1234567을 받아서 123456 -1****** 형태로 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 입력(-포함) : ");
		String str9 = scan.next();
		System.out.println(str9.substring(0,8)+"******");
		//저장해서 사용하려면
		//String jumin = str9.substring(0,8) + "******";
		//sysout(jumin);도 가능
		
		//trim() : 앞, 뒤 공백제거
		String stTrim = "     kim";
		String stTrim2 = "kim     ";
		
		System.out.println(stTrim);//     kim
		System.out.println(stTrim2+";");//kim     ; 그냥 출력하면 stTrim, stTrim2모두 공백이 있음
		String stTrim3 = "     kim     ";//앞과 뒤 공백 있는 상태로 출력
		
		System.out.println("-------trim() 앞 또는 뒤, 앞과 뒤 공백 지움-------");
		System.out.println(stTrim.trim());
		System.out.println(stTrim2.trim()+";");
		System.out.println(stTrim3+";");
		System.out.println(stTrim3.trim()+";");
		
		System.out.println("-------trim() 앞, 뒤 공백은 지워지지만 중간은 안지워짐------");
		String stTrim4 = "     kim     hong     lee     ";
		System.out.println(stTrim4.trim());
	}

}
