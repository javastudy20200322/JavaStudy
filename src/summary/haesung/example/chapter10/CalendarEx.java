package summary.haesung.example.chapter10;

import java.util.Calendar;

public class CalendarEx
{

	public static void main(String[] args)
	{
		// 기본적으로 현재 날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.get(Calendar.YEAR) + "년");
		System.out.println((today.get(Calendar.MONTH) + 1) + "월");	// 1~12월 -> 0~11로 표현된다.
		System.out.println("올해의 " + today.get(Calendar.WEEK_OF_YEAR) + "번째 주");
		System.out.println("이 달의 " + today.get(Calendar.WEEK_OF_MONTH) + "번째 주");
		
		System.out.println(today.get(Calendar.DATE) + "일");
		System.out.println("올해의 " + today.get(Calendar.DAY_OF_YEAR) + "일");
		System.out.println("이 달의 " + today.get(Calendar.DAY_OF_MONTH) + "일");
		
		System.out.println("이 주의 " + today.get(Calendar.DAY_OF_WEEK) + "번째 요일");	// 월요일 = 0, 일요일 = 7
		
		System.out.println(today.get(Calendar.AM_PM));	// 0:오전, 1:오후
		
		System.out.println(today.get(Calendar.HOUR) + "시");			// 0~11
		System.out.println(today.get(Calendar.HOUR_OF_DAY) + "시");	// 0~23
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.SECOND) + "초");
		System.out.println(today.get(Calendar.MILLISECOND) + "밀리초");
		
		System.out.println("이 달의 마지막 날 " + today.getActualMaximum(Calendar.DATE) + "일");
		
	}

}
