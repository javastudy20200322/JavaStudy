package summary.jaeyeon.example.chap10_DTF;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q4 {
	/*
	 * 화면으로 부터 날짜를 "2007/05/11" 의 형태로 입력받아서 무슨 요일인지 출력하는 프로그램을 작성하시오 단, 입력된 날짜의 형식이
	 * 잘못된 경우, 메세지를 보여주고 다시 입력 받아야한다.
	 * 
	 */
	public static void main(String[] args) {

		String pattern = "yyyy/MM/dd";

		DateFormat df = new SimpleDateFormat(pattern);

		Scanner s = new Scanner(System.in);

		Date inDate = null;

		System.out.println("날짜를 " + pattern + "  의 형태로 입력해주세요. ( 입력예 : 2020/5/31 )");

		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("날짜를 " + pattern + "  의 형태로 다시 입력해주세요.  ( 입력예 : 2020/05/31 )");

			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Date day2 = cal.getTime();

		SimpleDateFormat sdf5;
		sdf5 = new SimpleDateFormat("E요일");
		System.out.println("입력하신 날짜는 " + sdf5.format(day2) + "입니다.");

	}
}
