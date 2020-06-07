package summary.jaeyeon.practiceA.chap10_DTF1;

import java.util.Calendar;

public class CalendarEx5 {
	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date.set(2015,0,31);
		date2.set(2015,0,31);
		System.out.println(toString(date));
		System.out.println(toString(date2));
		date.roll(Calendar.MONTH,1);
		date2.add(Calendar.MONTH,1);
		System.out.println(toString(date));
		System.out.println(toString(date2));
		
	}
	
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
		
	}
}
