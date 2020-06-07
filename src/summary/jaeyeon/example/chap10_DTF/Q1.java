package summary.jaeyeon.example.chap10_DTF;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Q1 {
	/*
	 * Calendar 클래스와 SimpleDateFormat 클래스를 이용해서
	 * 2020년의 매월 두 번째 일요일의 날짜를 출력하시오 2020년
	 * 1월 첫번째 일요일 찾아보기 두번째 일요일 찾기 12번반복하기
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();

		cal.set(2010, 0, 1);
		//LocalDate date = LocalDate.of(2020, 1, 1);
		for (int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);

			/*
			 * 두 번째 일요일은 1일의 요일에 따라 달라진다.
			 * 1일이 일요일인 경우에는 두번째 일요일은 8일이고,
			 * 1일이 다른 요일일때는 16에서 1일의  요일(weekday)을 빼면 알 수 있다.
			 */

			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
			// int thirdWed = (weekday == 3) ? 10 : 16 - weekday;

			// 두번째 일요일(secondsSunday) 로 cal 의 날짜(DAY_OF_MONTH) 를 바꾼다.
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			// cal.set(Calendar.DAY_OF_MONTH, thirdWed);

			Date d = cal.getTime();// Calendar 를 Date 로 변환한다.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));

			// 날짜를 다음달 1일로 변경한다.
			 //cal.add(Calendar.MONTH, 1);
			cal.roll(Calendar.MONTH, 1); // 이번 문제에서는 roll 이나 add 의 차이가 없음.
			cal.set(Calendar.DAY_OF_MONTH, 1);

			 //System.out.println("2번째 일요일"+date.with(dayOfWeekInMonth(2, SUNDAY )));
			//date.plus(1,ChronoUnit.MONTHS);
			// System.out.println(date);
		}

	}

}
