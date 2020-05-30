package summary.haesung.example.chapter10;

public class CalendarEx3
{

	public static void main(String[] args)
	{ 
		System.out.println("2014. 5. 31 :" + getDayOfWeek(2014, 5, 31)); 
		System.out.println("2012. 6. 1 :" + getDayOfWeek(2012, 6, 1)); 
		System.out.println("2014. 5. 1 - 2014.4.28 :" + dayDiff(2014,5,1,2014,4,28)); 
		System.out.println("2015. 6. 29 : "+convertDateToDay(2015, 6, 29)); 
		System.out.println("735778 : "+convertDayToDate(735778)); 
	} 

    // 각 달의 마지막일
	public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

	// 윤년이면 true를 반환
	public static boolean isLeapYear(int year)
	{ 
		// 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. (1988년, 1992년, 1996년, 2004년, 2008년, 2012년, 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
		// 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. (1900년, 2100년, 2200년, 2300년, 2500년...)
		// 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. (2000년, 2400년...)
		return ((year%4==0)&&(year%100!=0)||(year%400==0)); 
	} 

	// 두 날짜간의 차이를 일단위로 반환한다.
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2)
	{
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2); 
	} 

	// 요일을 반환한다. 1:일요일, 7:토요일
	public static int getDayOfWeek(int year, int month, int day)
	{ 
		// 1~7의 값을 반환한다. 결과가 1이면 일요일이다. 
		return convertDateToDay(year, month, day)%7 + 1; 
	} 

	// 일단위의 값을 년월일의 문자열로 변환하여 반환한다.
	public static String convertDayToDate(int day)
	{ 
		int year			= 1; 
		int month			= 0; 

		while(true)
		{ 
			int aYear = isLeapYear(year)? 366 :365;
			
			if (day > aYear )
			{ 
				day-= aYear; 
				year++; 
			}
			else
			{ 
				break; 
			} 
		} 

		while(true)
		{ 
			int endDay = endOfMonth[month]; 
                     // 윤년이고 윤달이 포함되어 있으면, 1일을 더 뺀다. 
			if(isLeapYear(year) && month == 1) endDay++;    

			if(day > endDay) { 
				day -= endDay; 
				month++; 
			} else { 
				break;                         
			} 
		} 

		return year+"-"+(month+1)+"-"+day; 
	} 

	// 년월일을 입력받아서 일단위로 변환한다.
	public static int convertDateToDay(int year, int month, int day)
	{ 
		int numOfLeapYear =0; // 윤년의 수 

		// 전년도까지의 윤년의 수를 구한다. 
		for(int i=1;i < year; i++)
		{ 
			if(isLeapYear(i)) 
				numOfLeapYear++; 
		} 

		// 전년도까지의 일 수를 구한다. 
		int toLastYearDaySum = (year-1) * 365 + numOfLeapYear; 

		// 올해의 현재 월까지의 일수 계산 
		int thisYearDaySum =0; 

		for(int i=0; i < month-1; i++)
		{ 
			thisYearDaySum+=endOfMonth[i]; 
		} 

		// 윤년이고, 2월이 포함되어 있으면 1일을 증가시킨다. 
		if (month > 2 && isLeapYear(year))
		{
			thisYearDaySum++; 
		}

		thisYearDaySum+=day; 

		return toLastYearDaySum+thisYearDaySum; 
	}

}
