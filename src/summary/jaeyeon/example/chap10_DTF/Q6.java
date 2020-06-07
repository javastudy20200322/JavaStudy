package summary.jaeyeon.example.chap10_DTF;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q6 {
/*
 * 자신이 태어날 날로부터 지금까지 며칠이 지났는지 계산해서 출력하시오
 * 
 */
	
	public static void main(String[] args) {
		
		
		LocalDate birthDay = LocalDate.of(1989, 1, 16);// 내 생일 ㅠㅠ
		LocalDate now = LocalDate.now();
		//System.out.println(ChronoUnit.WEEKS);
		long days = birthDay.until(now,  ChronoUnit.DAYS);
		
		long weeks = birthDay.until(now, ChronoUnit.WEEKS);
		
		long months = birthDay.until(now,  ChronoUnit.MONTHS);
		System.out.println("내생일 : " + birthDay);
		System.out.println("오늘 : " + now);
		System.out.println(days + " days" );
		System.out.println(weeks + " weeks");
		System.out.println(months + " months");
		
		
	}
	
}
