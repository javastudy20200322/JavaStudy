package summary.jaeyeon.example.chap10_DTF;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Q7 {
	/*
	 * 2016년 12월 넷째주 화요일의 날짜를 아래의 실행결과과 같은 형식으로 출력하시오.
	 * 
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 12, 1);

		System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY)));
		//이게 에러나면 위에 import 문을 제대로 적었는지 확인!
		
		
		/*
		 * Calendar cal = Calendar.getInstance();
		 * 
		 * cal.set(2016, 11, 1); Date d = cal.getTime();// Calendar 를 Date 로 변환한다.
		 * System.out.println(new
		 * SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
		 */
		
	}

}
