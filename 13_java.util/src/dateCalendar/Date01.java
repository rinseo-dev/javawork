package dateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date now = new Date(); //import util
		System.out.println(now); //toString으로 오버라이딩 되어 있어서 주소가 아니라 날짜가 출력됨
		
		// MM:월, mm:분, HH:24시간
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));//SimpleDateFormat로 설정한 방식으로 출력됨
		
		//a : 오전,오후 / hh(소문자):12시간
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf2.format(now));
		
		// E : 요일 - local에 맞춰서 한글, 영어 등으로 표시됨.
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
		System.out.println(sdf3.format(now));
		
		//년,월,시,분,초로도 표시가능.
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf4.format(now));
		
		// D : 365일 중 며칠째인지
		SimpleDateFormat sdf5 = new SimpleDateFormat("D");
		System.out.println(sdf5.format(now));
		
		//20231103을 날짜형식에 맞춰서 출력하기
		String strDate = "20231103";
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date strNow = sdf6.parse(strDate);//String을 data타입으로 변경해줘야 출력 가능, try-catch발생.
			System.out.println(sdf6.format(strNow));
			System.out.println(sdf7.format(strNow));//String으로 데이터를 받으면 두번 변경해서 사용
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//책 예시 Date,SimpleDateFormat을 사용해서 2024년 05월 08일 화요일 10시 30분 출력하기
		Date now2 = new Date();
		SimpleDateFormat sdfnow2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdfnow2.format(now2));
		
	}

}
