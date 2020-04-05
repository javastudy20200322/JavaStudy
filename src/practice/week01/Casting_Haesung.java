package practice.week01;

import java.util.Scanner;


/**
 * <pre>
 * Date		: 2020. 3. 20.
 * Author	: pureboyz
 * 
 * 사용자가 입력한 값이 변환될 수 있는 타입을 알려주는 프로그램.
 * </pre>
 */
public class Casting_Haesung
{
	// 사용자에게 값을 입력받기 위한 Scanner 객체.
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean isRun = true;	// isRun이 false가 되면 프로그램 종료.
		while(isRun)
		{
			System.out.println("------------------------------------------");
			System.out.println("|			입력할 기본형 타입을 선택하세요.        |");
			System.out.println("------------------------------------------");
			System.out.println("| 1.문자형 | 2.정수형 | 3.실수형 | 4.논리형 | 5.종료 |");
			System.out.println("------------------------------------------");
			System.out.print("> ");
			
			String selectedNumber = scanner.next();	// 사용자가 선택한 번호.

			switch(selectedNumber)
			{
				// 1번 선택 시
				case "1":
					System.out.println(castToChar());
					System.out.println("\n");
					break;
					
				// 2번 선택 시
				case "2":
					System.out.println(castToInteger());
					System.out.println("\n");
					break;
					
				// 3번 선택 시
				case "3":
					System.out.println(castToRealNumber());
					System.out.println("\n");
					break;
					
				// 4번 선택 시
				case "4":
					System.out.println(castToBoolean());
					System.out.println("\n");
					break;
					
				// 5번 선택 시
				case "5":
					System.out.println("프로그램을 종료합니다.");
					isRun = false;
					break;
					
				// 1~5번이 아닌 다른 입력값을 받았을 때
				default:
					System.out.println("1~5 사이의 번호를 입력하세요.");
					break;
			}
		}
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToChar
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 문자형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * char 타입이 저장할 수 있는 값은 한 자리의 문자 또는 0 ~ 65535의 정수
	 * </pre>
	 */
	public static String castToChar()
	{
		String result 		= "";
		
		System.out.print("값을 입력하세요. > ");
		
		String ipnutValue 	= scanner.next();
		
		if(ipnutValue.length() == 1)
		{
			result = "변환 가능한 타입은 char 입니다.";
		}
		else
		{
			int intValue = Integer.parseInt(ipnutValue);
			
			if((0 <= intValue) && (intValue <= 65535))
			{
				result = "변환 가능한 타입은 char 입니다.";
			}
			else
			{
				result = "변환 가능한 문자형 타입이 없습니다.";
			}
		}
		
		return result;
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToInteger
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 정수형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * long 	타입이 저장할 수 있는 값의 범위는 -2^63 ~ 2^63-1
	 * int  	타입이 저장할 수 있는 값의 범위는 -2,147,483,648 ~ 2,147,483,647
	 * short 	타입이 저장할 수 있는 값의 범위는 -32,768 ~ 32,767
	 * byte  	타입이 저장할 수 있는 값의 범위는 -128 ~ 127
	 * char  	타입이 저장할 수 있는 값의 범위는 0 ~ 65535
	 * </pre>
	 */
	public static String castToInteger()
	{
		String result 		= "변환 가능한 타입은 ";
		
		System.out.print("값을 입력하세요. > ");
		
		long ipnutValue 	= scanner.nextLong();
		
//		if((-128 <= ipnutValue) && (ipnutValue <= 127))
//		{
//			result += " byte ";
//		}
//		
//		if((-32768 <= ipnutValue) && (ipnutValue <= 32767))
//		{
//			result += " short ";
//		}
		
		
		
		
		if((-9223372036854775808L <= ipnutValue) && (ipnutValue <= 9223372036854775807L))
		{
			result += " long ";
			
			if((-2147483648 <= ipnutValue) && (ipnutValue <= 2147483647))
			{
				result += " int ";
				
				if((-32768 <= ipnutValue) && (ipnutValue <= 32767))
				{
					result += " short ";
					
					if((-128 <= ipnutValue) && (ipnutValue <= 127))
					{
						result += " byte ";
					}
				}
				
				if((0 <= ipnutValue) && (ipnutValue <= 65535))
				{
					result += " char ";
				}
			}
		}
		
		
		return result;
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToRealNumber
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 실수형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * double 	타입이 저장할 수 있는 값의 범위는 +-4.9e-324 ~ +-1.7e308
	 * float  	타입이 저장할 수 있는 값의 범위는 +-1.4e-45 ~ +-3.4e38
	 * </pre>
	 */
	public static String castToRealNumber()
	{
		String result 		= "변환 가능한 타입은 ";
		
		System.out.print("값을 입력하세요. > ");
		
		double ipnutValue 	= scanner.nextDouble();
		
		if((-3.4e38 <= ipnutValue) && (ipnutValue <= 3.4e38)
				|| !(-1.4e-45 < ipnutValue) && (ipnutValue < 1.4e-45))
		{
			result += " float ";
		}
		
		if(((-1.7e308 < ipnutValue) && (ipnutValue < 1.7e308))
				|| !((-4.9e-324 <= ipnutValue) && (ipnutValue <= 4.9e-324)))
		{
			result += " double ";
		}
		
		System.out.println(-4.9e-324 < -1.7e308);
		
		result += "입니다.";
		
		return result;
	}
	
	
	/**
	 * <pre>
	 * MethodName	: castToBoolean
	 * Date 		: 2020. 3. 20.
	 * Author		: pureboyz
	 * 
	 * Params		: 
	 * ReturnType	: String
	 * 
	 * 사용자에게 값을 입력받아 해당 값이 논리형으로 형변환이 가능한지 여부를 알려준다.
	 * 변환이 가능하다면 변환이 가능한 타입을 알려준다.
	 * 
	 * boolean 타입이 저장할 수 있는 값은 true 또는 false
	 * </pre>
	 */
	public static String castToBoolean()
	{
		String result 		= "";
		
		System.out.print("값을 입력하세요. > ");
		
		String ipnutValue 	= scanner.next();
		
		if(ipnutValue.equals("true") || ipnutValue.equals("false"))
		{
			result = "변환 가능한 타입은 boolean 입니다.";
		}
		else
		{
			result = "변환가능한 논리형 타입이 없습니다.";
		}
		System.out.println(2 < 5);
		
		return result;
	}
}
