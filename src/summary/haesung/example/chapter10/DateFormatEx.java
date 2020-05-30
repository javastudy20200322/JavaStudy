package summary.haesung.example.chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx
{

	public static void main(String[] args) throws ParseException
	{
		// yyyy-MM-dd HH:mm:ss.SSS 말고도 아래 포맷도 있다.
		System.out.println(new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.").format(new Date()));
		System.out.println(new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.").format(new Date()));
		System.out.println(new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.").format(new Date()));
		System.out.println(new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.").format(new Date()));
		System.out.println(new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.").format(new Date()));
		
		// format()의 매개변수로는 Date 인스턴스만 가능하기 때문에 Calendar 인스턴스를 Date 인스턴스로 변환하여 사용.
		Calendar cal = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(cal.getTime()));
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		cal2.setTime(new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31"));
		System.out.println("2015/12/31 는 현재와 "
				+(cal3.getTimeInMillis() - cal2.getTimeInMillis()) / (60*60*1000)
				+"시간 차이");
	}

}
