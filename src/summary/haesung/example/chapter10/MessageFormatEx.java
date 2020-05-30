package summary.haesung.example.chapter10;

import java.text.*;

public class MessageFormatEx
{

	public static void main(String[] args)
	{
		// arguments배열의 각 index가 {index}에 담기네
		String 		msg 		= "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
		Object[] 	arguments 	= {"이자바", "02-123-1234", "27", "07-09"};
		
		String result = MessageFormat.format(msg, arguments);
		
		System.out.println(result);
	}

}
