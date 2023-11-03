package list01;

import java.util.Vector;

public class Vector02 {

	public static void main(String[] args) {
		//ArrayList와 Vector는 클래스 이름만 다르고 사용하는 방식은 같음.
		Vector<String> vlist = new Vector<>();
		vlist.add("Vector");
		vlist.add("ArrayList");
		
		vlist.remove(0); 
		vlist.remove("ArrayList"); //index번호나 객체이름을 넣어서 삭제 가능
	}

}
