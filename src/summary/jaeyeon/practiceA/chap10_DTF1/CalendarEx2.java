package summary.jaeyeon.practiceA.chap10_DTF1;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0] 은 비워둠.
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		// month 의 경우 0부터 지삭하기 때문에 8월인 경우, 7로 지정해야한다.
		// date1.set(2015, Calendar.AUGUST,15);이렇게 지정할 수도 있음.

		date1.set(2015, 7, 15);
		System.out.println("date1 은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("오늘(date2) 은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
// 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야한다.
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("그 날(date) 부터 지금(date2) 까지 " + difference + " 초가 지났습니다.");
		
		System.out.println("일(day) 로 계산하면 " + difference / (24 * 60 * 60) + " 일 입니다.");
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년  " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}

}
