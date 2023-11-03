package dateCalendar;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDate03 {

	public static void main(String[] args) {
		
		//날짜만 얻어오기
		LocalDate today = LocalDate.now(); //import time
		System.out.println(today);
		System.out.println(today.getYear()+"년");
		System.out.println(today.getMonth());//영문으로 월 표시됨
		System.out.println(today.getMonthValue()+"월");//월을 숫자로 가져옴
		System.out.println(today.getDayOfMonth()+"일");//이 달 중에서 며칠인지
		System.out.println("365일 중"+today.getDayOfYear()+"일"); //이 년도에서 며칠째인지
		System.out.println(today.getDayOfWeek()); //이 주에서 무슨 요일인지
		System.out.println(today.getDayOfWeek().getValue());// .getValue로 가져오면 요일을 숫자로 가져오게 됨. 1:월요일
		
		System.out.println("이 달의 마지막 날짜는 " + today.lengthOfMonth() + "일");//이 달의 마지막 날짜를 표시. 윤달인 경우가 있으므로 날짜 체크
		System.out.println("올해는 총 " + today.lengthOfYear() + "일"); //윤년인 경우 값이 365가 아니므로 사용하게 됨
		System.out.println("올해 윤년 : " + today.isLeapYear());//올해가 윤년인지를 true,false 로 나타냄
		
		LocalDate endDay = LocalDate.of(2024, 5, 2);
		System.out.println(endDay);
		Period p = today.until(endDay); //Period형을 쓰면 몇개월, 며칠이 남았는지 가져올 수 있음
		System.out.println(p.getMonths()+"개월"+p.getDays()+" 일 남음");
		
		System.out.println("===========================");
		//시간만 얻어오기
		LocalTime time = LocalTime.now();
		System.out.println(time);//지금 시간. 소수점 이하까지 나돔
		System.out.println(time.getHour()); //시, 분, 초별로 따로 가져옴
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		LocalTime time2 = LocalTime.of(9, 30, 20);
		System.out.println(time2);
		
		Duration d = Duration.between(time2, time);
		System.out.println(d.getSeconds()+"몇 초가 지났는지"); // '/60/'하면 분 단위로 볼 수 있음. getSeconds밖에 없어서 getMinute안됨
		
		System.out.println("===========================");
		
		//날짜와 시간 모두 얻어오기
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow);
		
		//지역 별로 시간 데이터를 가져올 수 있음 대륙/도시이름 인가봄.
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime newYorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newYorkDT);
	}
}
