package inOut01;

import java.io.*;

public class CharStream03 {

	public static void main(String[] args) {

		/*
		 * 문자 기반 스트림
		 * - 문자 스트림 : 데이터를 2byte단위로 전송하는 통로
		 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		 * 
		 * xxxReader : 입력용 스트림
		 * xxxWriter : 출력용 스트림
		 */
		
		//fileSave();
		fileRead();
	}

	public static void fileSave() {
		FileWriter fw = null;
		
		try {
			/*
			 - false(기본값) : 파일에 데이터가 있어도 덮어쓰기
			 - true : 파일에 데이터가 있으면 이어서 쓰기를 함
			 */
			
			//1.스트림 생성
			fw = new FileWriter("b_char.txt"); //무조건 덮어쓰기
			//fw = new FileWriter("b_char.txt",true); //이렇게 입력하면 기존 파일에 추가로 입력됨.
			
			fw.write("한글 가능"); //2byte 공간을 가짐 - 한/글/ /가/능 으로 분리되어 저장, 출력 되나봄
			fw.write('d'); // ' '공백도 가능
			fw.write("\n");//enter키
			
			char[] arr = {'A', 'd', 'd', 'i', 'n','e','d','u'};
			fw.write(arr);
			fw.write("\n");
			
			char[] arrStr = {'김','홍','이'};
			fw.write(arrStr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//close()를 finally에 넣으면 try-catch문의 실행, 오류 여부와 관련 없이 종료 할 수 있음.
			//Scanner를 사용했을 때도 finally에서 닫아주면 됨.
			//꼭 반납을 해야하는 경우에 finally사용ㅉ
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void fileRead() {
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			int value = 0; //바깥쪽에 변수 하나 넣어주고 while문으로 돌림
			while((value = fr.read()) != -1) { //-1 은 '맨 끝이 아니면'
				//System.out.println(value); //value로 출력하면 유니코드가 출력됨 . \n도 지정된 유니코드가 있음.
				 System.out.print((char)value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
