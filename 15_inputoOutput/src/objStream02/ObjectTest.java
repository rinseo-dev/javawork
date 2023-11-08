package objStream02;

public class ObjectTest {

	public static void main(String[] args) {
		ObjectDao od1 = new ObjectDao();
		//od1.fileSave(); //직렬화 하지 않으면  NotSerializableException Exception발생
		od1.fileRead();
	}

}
