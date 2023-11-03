package dateCalendar;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();//Calendar는 기존에 있는걸 instance상태로(객체로) 가져와서 .getInstance를 사용
		System.out.println("현재 년도 : " + today.get(Calendar.YEAR)); //대문자 : 상수
		System.out.println("현재 월 : " + (today.get(Calendar.MONTH)+1));//MONTH는 해당 월을 찾을 때 꼭 +1을 해야 함. 숫자 하나 모자라게 나옴
		System.out.println("현재 일 : " + today.get(Calendar.DATE));

		//요일 1~7(1:일요일)
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//바로 출력하면 숫자로 나옴. switch-case나 if문으로 요일로 바꿔줘야함.
		switch(week) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
		//배열에 넣어서 index번호+1로 사용해도 됨
		//switch-case보다 간단함
		String[] weeks = {"일","월","화","수","목","금","토"};
		System.out.println(weeks[today.get(Calendar.DAY_OF_WEEK)-1]+"요일");
		//today.get(Calendar.DAY_OF_WEEK)는 1~7까지의 값을 반환하는데 배열 weeks는 0~6값을 가지므로 -1해줘야 인덱스번호로 요일 이름 가져옴.
		
		Calendar date = Calendar.getInstance();
		date.set(2020, 11, 3);
		System.out.println(date.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.YEAR)-date.get(Calendar.YEAR)+"년이 지남");
		//오늘 날짜는 today에 넣었으므로 date.get(Calendar.YEAR)를 빼주면 시간이 얼마나 흘렀는지 알 수 있음
		
		
	}

}
