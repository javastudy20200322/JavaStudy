package summary.haesung.practice.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : getDayDiff
 * 기 능 : yyyymmdd형식의 두 문자열을 넘겨받으면 두 날짜의 차이를 일(day)단위로 반환한다.
 * 단, 첫 번째 날짜 빼기 두 번째 날짜의 결과를 반환한다.
 * 만일 주어진 문자열이 유효하지 않으면 0을 반환한다.
 * 반환타입 : int
 * 매개변수 : String yyyymmdd1 - 시작날짜
 * 		   String yyyymmdd2 - 끝 날짜
 * </pre>
 */
public class Example05
{
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2)
	{
		DateFormat df1 = new SimpleDateFormat("yyyyMMdd");
		DateFormat df2 = new SimpleDateFormat("D");	// 올해의 며칠째인지 알 수 있다.
		
		try
		{
			Calendar calendar1 = Calendar.getInstance();
			Calendar calendar2 = Calendar.getInstance();
			
			// Calendar에 시간 설정
			calendar1.setTime(df1.parse(yyyymmdd1));
			calendar2.setTime(df1.parse(yyyymmdd2));
			
			// 올해의 며칠째인지를 문자열로 담고
			String dayOfYear1 = df2.format(calendar1.getTime());
			String dayOfYear2 = df2.format(calendar2.getTime());
			
			// 차이를 반환
			return Math.abs(Integer.parseInt(dayOfYear1) - Integer.parseInt(dayOfYear2));
		}
		catch (ParseException e)
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
	}

}
