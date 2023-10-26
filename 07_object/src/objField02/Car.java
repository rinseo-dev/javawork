package objField02;

//라이브러리
public class Car {
	String company = "삼성자동차"; //String은 참조형으로 기본값 : null
	String model = "SM7";
	
	int maxSpeed = 300; //변수, 기본값 : 0 / 이렇게 변수로 지정하기도 하지만 max값이 변화되지 않는 경우이므로 상수로 해줘야 함
	
	final int MAX_SPEED = 300; //상수, 기본값 : 0 /상수는 보통 대문자로 이루어지고, 단어 구분은 언더바로함
	//상수로 바꿈. 고정되는 값으로 변화가 없음. max이므로 초과 할 수 없으므로 상수로 선언해주는 게 좋음.
	
	boolean engineStart; // 기본값: false;
}
