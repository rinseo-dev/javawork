package inOut01;

import java.io.File;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		//간단한 파일을 만들 때, 미리 구현되어 있는 java.io.File클래스 이용.
		//File f1 = new File("test.txt");//java에서 사용하는 File에 저장, 가져와서 읽기 등 가능.
		//f1.createNewFile(); //f1에 있는 test.txt파일을 만들어줌./try-catch발생
		
		//이 상태로 실행하면 프로젝트 폴더에 test.txt파일이 생성됨
		try {
			File f1 = new File("test.txt");//try-catch 안으로 옮김
			f1.createNewFile(); //f1에 있는 test.txt파일을 만들어줌./try-catch발생
			//반드시 createNewFile()메서드를 호출해야 파일이 생성됨.
			
			//파일이 생성될 경로 지정
			//File f2 = new File("C:\\test01.txt");
			// 원래 파일 경로는 \역슬래시를 사용함. 하지만 자바에서는 \n는 뉴라인, \t는 탭 등 다른 지정값이 있음.
			// 역슬래시로 경로를 지정할 때는 \\로 두개를 넣어야 역슬래시로 인식해서 주소가 됨.
			File f2 = new File("C:/Users/test01.txt");
			// 그래서 자바에서는 경로를 지정할 때 슬래시를 사용함. C:/test01.txt 형식으로 슬래시를 써서 주소를 표현함.
			f2.createNewFile();
			
			// mkdir : 폴더생성 명령어
			File folderMk = new File("C:/Users/temp"); // 지정 주소에 폴더 생성됨.
			folderMk.mkdir();
			
			File f3 = new File("C:/Users/temp/test02.txt");
			f3.createNewFile();
			
			System.out.println("test.txt 파일이 존재 하는가? " + f1.exists()); //f1파일이 존재하는지 확인 T/F로 표시됨
			System.out.println("test03.txt파일이 존재 하는가? "+new File("test03.txt").exists()); //객체는 생성했지만 createNewFile안해서 실체가 없음.
			
			System.out.println("test.txt가 파일인가? " + f1.isFile()); //이거 파일인가? true
			System.out.println("temp는 파일인가? " + folderMk.isFile());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
