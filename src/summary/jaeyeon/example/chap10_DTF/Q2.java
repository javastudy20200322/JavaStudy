package summary.jaeyeon.example.chap10_DTF;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 어떤 회사의 월급날이 매월 21일이다.
 * 두 날짜 사이에 월급날이 몇 번 있는지 계산해서 반환하는 메서드를 작성하고 테스트 하시오.
 * 
 */
public class Q2 {
	static int paycheckCount(Calendar from, Calendar to) {
		/*
		 * (1) 아래의 로직에 맞게 코드를 작성하시오.
		 *  1. from 또는 to 가 null 이면 0을 반환한다.
		 *  2. from 과 to 가 같고 날짜가 21일이면 1을 반환한다.
		 *  3. to와 from 이 몇 개월 차이인지 계산해서 변수 monDiff 에 담는다.
		 *  4. monDiff가 음수이면 0을 반환한다.
		 *  5. 만약 from 의 일(DAY_OF_MONTH)이 21일이거나 이전이고,
		 *        to 의 일(DAY_OF_MONTH)이 21일이거나 이후이면 monDiff의 값을 1 증가시킨다.
		 *  6, 만약 from 의 일(DAY_OF_MONTH)이 21일 이후고,
		 *        to 의 일(DAY_OF_MONTH)이 21일 이전이면 monDiff의 값을 1 감소시킨다.
		 */
		
		//1. from 또는 to 가 null 이면 0을 반환한다.
		if(from == null || to==null) {
			return 0;
		}
		
		//  2. from 과 to 가 같고 날짜가 21일이면 1을 반환한다.
		if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) {
			return 1;
		}
		
		// 3. to와 from 이 몇 개월 차이인지 계산해서 변수 monDiff 에 담는다.
		int fromYear = from.get(Calendar.YEAR);
		int fromMon = from.get(Calendar.MONTH);
		int fromDay = from.get(Calendar.DAY_OF_MONTH);

		int toYear = to.get(Calendar.YEAR);
		int toMon = to.get(Calendar.MONTH);
		int toDay = to.get(Calendar.DAY_OF_MONTH);
	
		int monDiff = (toYear * 12 + toMon) - (fromYear * 12 + fromMon);

		//4. monDiff가 음수이면 0을 반환한다.
		if(monDiff < 0) {
			return 0;
		}
		
		/*  5. 만약 from 의 일(DAY_OF_MONTH)이 21일이거나 이전이고,
		 *        to 의 일(DAY_OF_MONTH)이 21일이거나 이후이면 monDiff의 값을 1 증가시킨다.
		*/
		if(fromDay <=21 && toDay>= 21) {
			monDiff++;
		}
		
		/*  6. 만약 from 의 일(DAY_OF_MONTH)이 21일 이후고,
		 *        to 의 일(DAY_OF_MONTH)이 21일 이전이면 monDiff의 값을 1 감소시킨다.
		 */
		
		
		if(fromDay > 21 && toDay < 21) {
			monDiff--;
		}
		
		return monDiff;
	}

	static void printResult(Calendar from, Calendar to) {

		Date fromDate = from.getTime();
		Date toDate = to.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");

		System.out.println(paycheckCount(from, to));

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();

		fromCal.set(2020, 0, 1);
		toCal.set(2020, 0, 1);
		printResult(fromCal, toCal);

		fromCal.set(2020, 0, 21);
		toCal.set(2020, 0, 21);
		printResult(fromCal, toCal);

		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 1);
		printResult(fromCal, toCal);

		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 23);
		printResult(fromCal, toCal);

		fromCal.set(2020, 0, 23);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);

		fromCal.set(2020, 0, 22);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);

	}

}
