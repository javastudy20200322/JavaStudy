package summary.haesung.practice.chapter10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * 서울과 뉴욕간의 시차가 얼마인지 계산하여 출력하시오.
 * </pre>
 */
public class Example08
{

	public static void main(String[] args)
	{
		LocalDateTime 	ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		ZoneId 			zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime 	zdt = ldt.atZone(zid);
		System.out.println(zdt);
		
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ldt.atZone(nyId);
		System.out.println(nyTime);	// 나는 왜 -4시간이지??
		
		ZoneOffset krOffset = zdt.getOffset();
		ZoneOffset nyOffset = nyTime.getOffset();
		System.out.println("sec1 : " + krOffset.getTotalSeconds());
		System.out.println("sec2 : " + nyOffset.getTotalSeconds());
		System.out.println("diff : " + Duration.between(zdt, nyTime).getSeconds()/60/60 + " hrs");
	}

}
