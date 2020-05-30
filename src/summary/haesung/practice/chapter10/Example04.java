package summary.haesung.practice.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * <pre>
 * Date		: 2020. 5. 30.
 * Author 	: pureboyz
 * 
 * 화면으로부터 날짜를 “2007/05/11”의 형태로 입력받아서 무슨 요일인지 출력하는 프로그램을 작성하시오.
 * 단, 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받아야 한다.
 * </pre>
 */
public class Example04
{
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
			System.out.print(">> ");
			
			String 		strDate = scanner.next();
			String 		pattern = "yyyy/MM/dd";
			DateFormat 	df 		= new SimpleDateFormat(pattern);
			
			try
			{
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(df.parse(strDate));
				switch(calendar.DAY_OF_WEEK)
				{
				case 1:
					System.out.println("입력하신 날짜는 일요일입니다.");
					break;
				case 2:
					System.out.println("입력하신 날짜는 월요일입니다.");
					break;
				case 3:
					System.out.println("입력하신 날짜는 화요일입니다.");
					break;
				case 4:
					System.out.println("입력하신 날짜는 수요일입니다.");
					break;
				case 5:
					System.out.println("입력하신 날짜는 목요일입니다.");
					break;
				case 6:
					System.out.println("입력하신 날짜는 금요일입니다.");
					break;
				case 7:
					System.out.println("입력하신 날짜는 토요일입니다.");
					break;
				}
				break;
			}
			catch (ParseException e)
			{
				
			}
		}
	}

}
