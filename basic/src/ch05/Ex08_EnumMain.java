package ch05;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;

// ctrl+shift+o: 자동 임포트

/**
 * 열거 타입 변수 선언 및 할당
 *		열거타입 변수 = 열거타입.열거상수;
 *
 * Calendar
 * 	- 컴퓨터의 날짜 및 요일, 시간을 얻을 때 사용	
 */
public class Ex08_EnumMain {

	public static void main(String[] args) {
		//Week 열거 타입 변수 선언
		Week today = null;
 
		//Calendar 얻기
//		Calendar cal = Calendar.getInstance();
//		
//		int year = cal.get(Calendar.YEAR); // 연
//		int month = cal.get(Calendar.MONTH) + 1; // 월(1~12)
//		int day = cal.get(Calendar.DAY_OF_MONTH); // 일
//		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일(1~7)
//		int hour = cal.get(Calendar.HOUR); // 시
//		int minute = cal.get(Calendar.MINUTE); // 분
//		int second = cal.get(Calendar.SECOND); // 초
//		
//		System.out.println(year + "년 " + month + "월 " + day + "일 " + week + "요일");
//		System.out.println(hour + ":" + minute + ":" + second);
		
        LocalDateTime now = LocalDateTime.now();

        int year = now.getYear();
        int month = now.getMonthValue();        // 1~12
        int day = now.getDayOfMonth();          // 1~31
        //DayOfWeek week = now.getDayOfWeek(); // MONDAY ~ SUNDAY

        int hour = now.getHour();               // 0~23
        int minute = now.getMinute();
        int second = now.getSecond();

		
		//오늘의 요일 얻기(1~7)
		//week = cal.get(Calendar.DAY_OF_WEEK);
        int week = now.getDayOfWeek().getValue();
        System.out.println(year + "년 " + month + "월 " + day + "일 " + week);
        System.out.println(hour + ":" + minute + ":" + second);

		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
			case 1: today = Week.SUNDAY ; break;
			case 2: today = Week.MONDAY ; break;
			case 3: today = Week.TUESDAY ; break;
			case 4: today = Week.WEDNESDAY ; break;
			case 5: today = Week.THURSDAY ; break;
			case 6: today = Week.FRIDAY ; break;
			case 7: today = Week.SATURDAY ; break;
		}
		
		//열거 타입 변수를 사용
		if(today == Week.SATURDAY) {
			System.out.println("토요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}

	}

}
