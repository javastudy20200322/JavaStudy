package summary.haesung.practice.chapter10;

import java.time.LocalDate;
import java.time.Period;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * 자신이 태어난 날부터 지금까지 며칠이 지났는지 계산해서 출력하시오.
 * </pre>
 */
public class Example06
{

	public static void main(String[] args)
	{
		String strBirthDay 	= "1988-10-20";
		String strToday 	= "2020-05-30";
		
		LocalDate birthDay 	= LocalDate.parse(strBirthDay);
		LocalDate today 	= LocalDate.parse(strToday);
		
		Period p = Period.between(birthDay, today);
		System.out.println((p.getYears() * 365) + (p.getMonths() * 12) + (p.getDays()) + " days");
	}

}
