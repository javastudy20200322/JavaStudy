package summary.jaeyeon.practiceA.chap10_DTF1;

public class CalendarEx9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2014. 5. 31 : " + getDayOfWeek(2014, 5, 31));
		System.out.println("2012. 6. 1 : " + getDayOfWeek(2012, 6, 1));

	}

	public static int[] endOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	/**
	 * 
	 * @param year
	 * @return year 가 윤년이면 true, 아니면 false
	 */
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	/**
	 * @return 두 날짜간의 차이를 일 단위로
	 */
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);

	}

	/*
	 * @return 지정한 날짜의 요일을 반환
	 */
	public static int getDayOfWeek(int year, int month, int day) {
		return convertDateToDay(year, month, day) % 7 + 1;
	}

	/**
	 * 
	 * @param day
	 * @return 일 단위의 값을 년월일의 형태로 문자열로 변환하여 반환한다.
	 */
	public static String convertDayToDate(int day) {
		int year = 1;
		int month = 0;

		while (true) {
			int aYear = isLeapYear(year) ? 366 : 365;
			if (day > aYear) {
				day -= aYear;
				year++;
			} else {
				break;
			}
		}

		while (true) {
			int endDay = endOfMonth[month];

			// 윤년이고 윤달이 포함되어 있으면, 1일을 더한다.
			if (isLeapYear(year) && month == 1) {
				endDay++;
			}

			if (day > endDay) {
				day -= endDay;
				month++;
			} else {
				break;
			}
		}

		return year + "-" + (month + 1) + "-" + day;
	}

	/**
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return 년월일을 입력받아서 일단위로 변환한다.
	 */
	public static int convertDateToDay(int year, int month, int day) {
		int numOfLeapYear = 0; // 윤년의 수

		// 전년도 까지의 윤년의 수를 구한다.
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i)) {
				numOfLeapYear++;
			}
		}

		// 전년도 까지의 일수를 구한다.
		int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

		// 올해의 현재 월까지의 일수 계산
		int thisYearDaySum = 0;

		for (int i = 0; i < month - 1; i++) {

			thisYearDaySum += endOfMonth[i];

		}

		//윤년이고 2월이 포함되어 있으면 1일을 증가시킨다.
		if(month > 2 && isLeapYear(year)) {
			thisYearDaySum++;
		}
		
		return toLastYearDaySum + thisYearDaySum;

	}

}
