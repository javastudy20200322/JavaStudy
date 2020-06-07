package summary.jaeyeon.example.chap10_DTF;

import java.util.Calendar;

public class Q5 {

	static int getDayDiff(String d1, String d2) {

		int diff = 0;
		/*
		 * yyyymmdd 형식의 두 문자열을 넘겨받으면 두 날짜의 차이를 일(day)단위로 반환한다.
		 * 단, 첫 번째 날짜 빼기 두 번째 날짜의 결과를 반환한다. 만일 주어진 문자열이 유효하지 않으면 0을 반환한다.
		 * 
		 */
		try {
			int year1  = Integer.parseInt(d1.substring(0, 4));
			int month1 = Integer.parseInt(d1.substring(4, 6)) - 1;
			int day1   = Integer.parseInt(d1.substring(6, 8));

			int year2  = Integer.parseInt(d2.substring(0, 4));
			int month2 = Integer.parseInt(d2.substring(4, 6)) - 1;
			int day2   = Integer.parseInt(d2.substring(6, 8));

			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();

			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);

			diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis())
					/ (24 * 60 * 60 * 1000));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			diff = 0; // substring(), parseInt() 에서 예외가 발생하면 0을 반환한다.
		}

		return diff;
	}

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}

}
