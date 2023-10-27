package inEx02;

public class AiTv extends SmartTv{//SmartTv상속
	String genre;
	String genre(String genre) {
		this.genre = genre;
		return this.genre + "를 보여줍니다";
	}
}
