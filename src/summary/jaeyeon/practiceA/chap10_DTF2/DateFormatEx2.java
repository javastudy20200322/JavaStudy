package summary.jaeyeon.practiceA.chap10_DTF2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		cal.set(2020, 05, 31);

		Date day = cal.getTime();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		sdf5 = new SimpleDateFormat("F번째 E요일");
		
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));
		System.out.println(sdf5.format(day));

	}

}
