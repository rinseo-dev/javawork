package inOut01;

import java.io.*;

public class ByteStream02 {

	public static void main(String[] args) {
		//바이트 기반 스트림
		/*
		바이트 스트림 : 1byte를 전송함 단, 한글은 깨짐(2byte부터)
		기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		- xxxInputStream : xxx매체로부터 데이터를 입력받는 통로를 의미(외부 매체로부터 데이터를 읽어옴)
		- xxxOutputStream : xxx매체로 데이터를 출력하는 통로(외부 매체로 데이터를 내보냄 - 쓰기)
		*/
		
		//fileSave()를 메인에서 호출해야 사용할 수 있음
		//fileSave();
		fileRead();
	}
	
	public static void fileSave() {
		//파일 통로를 먼저 만들어줘야 함. 
		//FileOutputStream : 파일과 직접적으로 연결하여 1byte단위로 출력하는 스트림
		/*
		 1.스트림 생성(통로 만들기)
		 2.스트림 데이터를 출력(메서드 활용) - Output
		 3.다 사용한 후에 스트림 반납
		 */
		
		FileOutputStream fos = null;//java.io.FileOutputStream; io스트림엔 input,output이 모두 있으므로
		
		//fos = new FileOutputStream("a_byte.txt");//try-catch안에 넣어야 함. 파일이 없으면 만들고, 있으면 그 파일을 이용
		
		/* 
		 * 이런 식으로 try-catch가 2번 발생하게 됨. 하지만 중첩해서 사용하는 일은 별로 없음. catch문을 밖으로 빼줘야함.
		try {
			fos = new FileOutputStream("a_byte.txt", true);
			try {
				fos.write(2023);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		*/
		try {
			/*
			 FileOutputStream("파일명", treu or false)
			 - false(기본값) : 파일에 데이터가 있어도 덮어쓰기
			 - true : 파일에 데이터가 있으면 이어서 쓰기를 함
			 */
			//파일이 없으면 만들고, 있으면 그 파일을 이용
			//1.스트림 생성
			fos = new FileOutputStream("a_byte.txt");

			//2.스트림 데이터 출력
			fos.write(65); //add catch clause to surrounding try를 선택해서 catch문만 1개 추가 하는 방식으로 사용.
			fos.write('b'); //1byte이므로 문자 1개만 입력. / 한글(2byte)은 깨져서 입력됨
			
			byte[] arr = {97, 99, 100};
			fos.write(arr);//문자로 저장 / 오버로딩(?)을 통해서 배열이 들어올 수 있음.
			
//		} catch (FileNotFoundException e) {	
//			e.printStackTrace(); //IOException이 모든 입출력에 대한 예외처리로 더 큰 범위를 가지므로 IOException만 해줘도 됨. 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//3.스트림 반납(반드시 해야 함)
		try {
			fos.close(); //close()도  try-catch
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileRead() {
		//데이터를 받기 위해서 스트림이 필요함.
		//FileInputStream : 파일로 부터 1byte단위로 입력하는 스트림
		/*
		 1.스트림 생성(통로 만들기)
		 2.스트림 데이터를 입력 받아옴(메서드 활용) - Input
		 */
		FileInputStream fis = null;
		
		try {
			//1.스트림 생성(통로 만들기)
			fis = new FileInputStream("a_byte.txt");
			/* 출력구문. a_byte.txt파일에 있는 글자가 총 5개이므로 5번 출력하면 모든 글자를 출력하게 됨
			System.out.println(fis.read()); //1번 하면 글자 1개만 읽어옴-유니코드로 가져옴
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			
			//fis.read()를 조건에 걸면,  while조건에서 read()로 파일을 읽고, 출력문에서도 read()로 파일을 읽어서 띄엄띄엄 출력됨
			//2번, 4번 출력 후 -1이 출력됨.
			/*
			while(fis.read() != -1) { //-1이 되면 반복문이 종료됨.
				System.out.println(fis.read()); //출력하면 98, 99, -1로 출력됨. 
			}
			*/
			
			//반드시 fis.read() 호출은 한번만 해야 한 글자 출력이 가능함.
			//반복문으로 출력하는 방법1
			while(true) {
				//if(fis.read() != -1) { //조건을 이렇게 작성하면 위 while문과 똑같아짐. 이렇게는 사용하면 안됨.
				int value = fis.read();//하나를 읽어오고
				if(value == -1) {
					break;
				}else {
					System.out.println(value);//-1이 아닐 경우 출력
				}
			}
			
			//반복문으로 출력하는 방법2 : 권장하는 방법
			int result = 0;
			while((result = fis.read()) != -1) {
				System.out.println(result); //문자로 출력하고 싶으면 (char)result로 형변환60
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//3.닫기
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
