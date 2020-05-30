package summary.haesung.example.chapter10;

import java.util.Calendar;

public class CalendarEx2
{

	public static void main(String[] args)
	{
		final int[] 	TIME_OUT 		= {3600, 60, 1};
		final String[] 	TIME_UNIT_NAME 	= {"시간", "분", "초"};
		
		// Calendat 객체를 싱글톤처럼 호출하지만 싱글톤이 아니며, getInstance()가 호출될 때마다 새로운 객체가 생성된다.
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		System.out.println(time1.equals(time2));
		
		// getter, setter 느낌.
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : "
				+time1.get(Calendar.HOUR_OF_DAY) + "시 "
				+time1.get(Calendar.MINUTE) + "분 "
				+time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 : "
				+time2.get(Calendar.HOUR_OF_DAY) + "시 "
				+time2.get(Calendar.MINUTE) + "분 "
				+time2.get(Calendar.SECOND) + "초");
		
		
		Calendar date = Calendar.getInstance();
		
		// 매개변수를 년,월,일 순서로 넣어서 날짜를 setting할 수 있다.
		date.set(2015, 7, 31);	// 7->8월
		
		// add()를 이용하여 날짜 변경이 가능하다.
		date.add(Calendar.DATE, 10);	// 10일 후
		date.add(Calendar.MONTH, -6);	// 6달 전
		
		System.out.println(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) +  "-" + date.get(Calendar.DATE));
		
		// add는 40일 증가 시키면 월도 변하지만 roll은 일만 변한다.
		date.roll(Calendar.DATE, 40);
		System.out.println(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) +  "-" + date.get(Calendar.DATE));
	}

}
