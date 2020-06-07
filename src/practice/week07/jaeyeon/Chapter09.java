package practice.week07.jaeyeon;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
/**
 * 
 * @author stratojy(jaeyeon)
 *
 */
public class Chapter09
{

	public static void main(String[] args)
	{
		//Example1();
		//Example2();
		
		 // Example3();
		  //Example4();
		  Example5();
		 
	}
	
	// 주어진 byte배열을 문자열로 변환하세요.
	public static void Example1()
	{
		byte[] bytes 	= {73, 32, 108, 111, 118, 101, 32, 121, 111, 117, 46};
		String str 		= "";
		StringBuilder sb1 = new StringBuilder();
		
		//sb1.append(bytes);
		
		for(int i = 0 ; i < bytes.length; i++) {
			str += bytes[i];
			sb1.append(bytes[i]);
		}
		System.out.println(str);
		System.out.println(sb1);
		
		String str2 = new String(bytes);
		System.out.println(str2);
		
	}
	
	// 주어진 문자열에서 "자바" 문자열이 포함되어 있는지 확인하고, "자바"를 "Java"로 변경한 새로운 문자를 출력하세요.
	public static void Example2()
	{
		//replace & replaceAll 차이 한번 알아보기
		String src = "모든 프로그램은 자1바로 개발할 수 있다. 자2바 짱!";
		String str = "";
		if (src.contains("자바")) {
			str = src.replace("자바", "Java");
		}
		str = src;
		System.out.println(str);
	}
	// 문자열 src가 첫 번째는 알파벳으로 시작하고, 두 번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 값인지를
	// 정규 표현식(regExp)을 이용하여 유효성검사를 하세요.
	public static void Example3()
	{
		String src 		= "5Angel1004";
		String regExp 	= "";
		
		// 코드작성.
		
		boolean isMatch = Pattern.matches("[a-zA-Z][a-zA-z0-9]{7,11}", src);
		
		System.out.println(isMatch);
	}
	
//	Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개 들어 있는지 "q"을 입력할 때까지 반복하는 프로그램을 작성하라.
//	
//	예시)
//	>>I love Java.
//	어절 개수는 3
//	>>자바는 객체 지향 언어로서 매우 좋은 언어이다.
//	어절 개수는 7
//	>>q
//	종료합니다...
	public static void Example4()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.print(">> ");
			
			String input = scanner.nextLine();
			
			// 코드작성.
			
			if(input.equalsIgnoreCase("q")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			StringTokenizer st = new StringTokenizer(input, " ");
			int temp = st.countTokens();
			System.out.println("어절 갯수는 " + temp);
		}
	}
	
//	문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램을 작성하라.
//	
//	예시)
//	문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.
//	I Love you
//	 Love youI
//	Love youI 
//	ove youI L
//	ve youI Lo
//	e youI Lov
//	 youI Love
//	youI Love 
//	ouI Love y
//	uI Love yo
//	I Love you
	public static void Example5()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		System.out.print(">> ");

		String str = scanner.nextLine();
		
		// 코드작성.

		int len = str.length();
		String first, last;
		
		for(int i = 0 ; i< len ; i++) {
			first = str.substring(0,1);
			last = str.substring(1);
			
			str = last + first;
			System.out.println(str);
		}
		
	}
	
}
