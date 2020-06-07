package summary.jaeyeon.practiceA.chap10_DTF2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
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
				e.printStackTrace();
				System.out.println("날짜를 " + pattern + "  의 형태로 다시 입력해주세요.  ( 입력예 : 2020/05/31 )");
						
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Date day2 = cal.getTime();
		
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		
		System.out.println("입력하신 날짜는 현재와 "+day+ " 시간 차이가 있습니다.");
		SimpleDateFormat sdf5;
		sdf5 = new SimpleDateFormat("E요일");
		System.out.println("입력하신 날짜는 " + sdf5.format(day2) +"입니다.");
	}
}