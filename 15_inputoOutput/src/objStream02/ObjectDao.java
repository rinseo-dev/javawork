package objStream02;

import java.io.*;

public class ObjectDao {
	//객체를 입력, 출력 할 때 기본적으로 사용하는
	//기반스트림 : FileOutputStream - 1byte기준
	//보조스트림 : ObjectOutputStream - 객체단위로 출력할 수 있도록 도움을 주는 보조 트스림
	//			ObjectWriter 없음.
	public void fileSave() {
		//출력할 데이터를 객체 생성
		Phone ph1 = new Phone("아이폰",1300000);
		Phone ph2 = new Phone("갤럭시",1800000);
		Phone ph3 = new Phone("갤럭시울트라", 2000000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(ph1);
			oos.writeObject(ph2); 
			oos.writeObject(ph3); 
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	//기반스트림 : FileInputStream - 1byte기준
	//보조스트림 : ObjectInputStream - 객체단위로 가져올 수 있도록 도움을 주는 보조 스트림
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			//EOFException : 파일의 끝을 만나는 순간 예외 발생
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			*/
			while(true) { //끝까지 읽어야 되는 거라서  while(true)로 돌려도 됨
				System.out.println(ois.readObject());
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) { //IOException이전에 처리해야 함.
			System.out.println("파일 끝");
		}catch(IOException e) { //IOException이 가장 큰 단위여서 모든 예외처리를 가져감.
			e.printStackTrace();
		}
	}

}
