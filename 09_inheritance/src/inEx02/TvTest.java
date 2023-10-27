package inEx02;

public class TvTest {

	public static void main(String[] args) {
		AiTv ai = new AiTv();
		ai.power();//전원 켬
		ai.setChannel(11);//채널 11번
		System.out.println("현재 채널 : " + ai.getChannel());
		
		System.out.println(ai.internet("java")); //internet()은 리턴값이 있으므로 바로 출력 가능
		
		System.out.println(ai.genre("스릴러"));
		ai.setVolume(17);
		System.out.println("현재 볼룸: + " + ai.getVolume());
		
		ai.power();//전원 끔

		PopularTv pt = new PopularTv();
		System.out.println(pt.video("뽀로로"));
		
	}

}
