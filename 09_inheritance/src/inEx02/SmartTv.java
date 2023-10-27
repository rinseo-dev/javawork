package inEx02;

public class SmartTv extends Tv {//Tv클래스로부터 상속
	//SmartTv고유 기능
	String internet(String searcher) {//검색어를 String으로 받음
		return searcher + "를 검색하여 보여줍니다";
	}
	
	String netflix(String searcher) {
		return searcher + "를 보여줍니다";
	}

}
