package summary.haesung.practice.chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * Calendar클래스와 SimpleDateFormat클래스를 이용해서 2010년의 매월 두 번째 일요일의 날짜를 출력하시오.
 * </pre>
 */
public class Example01
{

	public static void main(String[] args)
	{
		// Calendar 객체
		Calendar calendar = Calendar.getInstance();
		
		// 1월 ~ 12월
		// Calendar에서 1월 = 0, 12월 = 11 로 표시된다.
		for(int i=0; i<12; i++)
		{
			// Calendar의 날짜를 매월 1일로 설정
			calendar.set(2010, i, 1);

			int dayOfWeek 		= calendar.get(Calendar.DAY_OF_WEEK);		// 매월 1일의 요일(일요일 = 1, 토요일 = 7)
			int secondSunday 	= (dayOfWeek == 1) ? 8 : (16 - dayOfWeek);	// 두번째 주 일요일의 날짜
			
			// Calendar의 날짜를 매월 둘째주 일요일로 설정
			calendar.set(2010, i, secondSunday);
			
			// Calendar를 Date로 변환
			Date date = calendar.getTime();
			
			// SimpleDateFormat의 포맷 설정
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			// 결과 출력
			System.out.println(sdf.format(date) + "은 2번째 일요일입니다.");
		}
	}

}
