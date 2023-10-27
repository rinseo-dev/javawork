package exDocument14;

class Product{
	static int count;
	//int serialNo;
	String serialNo;//serialNo를 String으로바꾼 경우
	
	//초기화 블럭은 잘 사용하지 않으므로, 생성자로 초기화(?)
	Product(){
		++count; //초기값 count는 1이 된 상태
		//serialNo = count; //int serialNo
		serialNo = "AddInEdu" + count; //String serialNo
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();//현재까지 p1,2,3의 serialNo는 모두 다름.
		
		System.out.println("p1 제품번호 : " + p1.serialNo); //p1은 객체의 '주소'를 가지고 있음.
		System.out.println("p2 제품번호 : " + p2.serialNo);
		System.out.println("p3 제품번호 : " + p3.serialNo);
		System.out.println("생산된 제품의 총 개수 : " + Product.count);
	}

}
