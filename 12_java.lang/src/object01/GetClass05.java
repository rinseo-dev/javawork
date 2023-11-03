package object01;


public class GetClass05 {

	public static void main(String[] args) {
		Card c1 = new Card("HEART",10);
		
		/*
		 * /newInstance는 곧 없어질 예정이라서 가로줄뜨므로, 주석처리해서 지움.
		//Card c2 = Card.class.newInstance(); //class객체를 통해서 객체 생성.  try-catch, multicatch가 발생함
		
		try {
			Card c2 = Card.class.newInstance(); /
		} catch (InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}//class객체를 통해서 객체 생성
		*/
		
		//getClass() : 객체 얻어오기
		Class cObj = new Card().getClass();//Card를 객체생성해서 class를 얻어옴 / 재정의한 것은 가져오지 않음
		Class cObj2 = c1.getClass(); //c1의 객체를 얻어와서 cObj2에 넣음
		
		try {
			Class cObj3 = Card.class.forName("Card"); //throws로 되어 있어서 try-catch 해줘야함.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c1);
		System.out.println(cObj.getName());
		System.out.println(cObj.toString()); //클래스이름고 ㅏ동일하게 나온다고?
		
		System.out.println(cObj2.getName());
		System.out.println(cObj2.toString());
	}

}
