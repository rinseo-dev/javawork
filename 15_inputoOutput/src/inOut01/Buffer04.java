package inOut01;

import java.io.*;

public class Buffer04 {
	/*
	 * 보조스트림 : 기반스트림으로 부족한 성능을 향상시켜주는 보조스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메서드를 제공(데이터 전송속도 향상 등)
	 * 		 	 >> 외부매체와 직접적으로 연결되는 스트림이 아님
	 *				단독사용 불가(반드시 기반스트림과 함께 사용)  
	 */
	public static void main(String[] args) {
		//fileSave();
		fileRead();
	}

	
	public static void fileSave() {
		// FileWriter - 기반스트림을 먼저 생성해야 보조스트림 사용 가능.
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림(속도 향상)
		
		/*
		 * 1. 기반스트림 생성
		 * 2. 보조스트림 생성
		 */
		//FileWriter fw = null;
		
		//FileWriter()라는 기반 스트림 생성했으므로 추가로 보조스트림 생성가능
		BufferedWriter bw = null;
		try {
			/*
			fw = new FileWriter("c_buffer.txt");
			bw = new BufferedWriter(fw); //fw를 기반으로 한 보조스트림을 사용하기 때문에 ()안에 파일명이 들어가면 안됨.
			//bw에는 fw의 주소가 들어간다고?
			//그런데 아래 한줄로 적은거에서 주소가 다시 new FileWriter("c_buffer.txt")의 주소로 덮어쓰기이?
			*/
			
			//이렇게 한줄로도 생성 가능.
			//통로역할이 되는 FileWriter를 한 줄로 입력한 것. BufferedWriter는 통로가 될 수 없음.
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			//FileWriter로 작성하면 바로 하나 하나 작성되고, 지금은 Bufferedwriter에 하나 하나 쌓는중.
			
			bw.write("안녕\n");
			bw.write("곧 즐거운 점심시간이야\n");
			bw.newLine(); //줄바꿈. ,BufferedWrite에 있는 메서드
			bw.write("와 맛있겠다");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * try-with-resource 구문으로 자원 반납까지 간단하게 작업 가능.
		 * jdk7 버전 이상부터 사용 가능
		 * try(try블럭내에서 사용항 스트림 객체 생성 구문) {
		 * }catch{
		 * }
		 */
		//이렇게 작성하면 bw2.close()를 작성하지 않아도 bw2를 close를 해줌.
		//하지만 사용하는 사람은 잘 없음. 익숙하지 않은게 이유인듯.
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("d_buffer.txt"))){ //객체 생성을 try에서 함.
			bw.write("안녕\n");
			bw.write("곧 즐거운 점심시간이야\n");
			bw.newLine(); //줄바꿈. ,BufferedWrite에 있는 메서드
			bw.write("와 맛있겠다");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//close를 하지 않아도 파일 불러오기 가능
	public static void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){ //객체 생성을 try에서 함.
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
