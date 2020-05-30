package summary.haesung.practice.chapter10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * 2016년 12월 넷째주 화요일의 날짜를 아래의 실행결과와 같은 형식으로 출력하시오.
 * </pre>
 */
public class Example07
{

	public static void main(String[] args)
	{
		LocalDate _20161201 = LocalDate.parse("2016-12-01");
		System.out.println(_20161201.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));
	}

}
