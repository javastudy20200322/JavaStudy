package summary.haesung.practice.chapter03;

/**
 * <pre>
 * Date 		: 2020. 4. 1.
 * Author 		: pureboyz
 *
 * Chapter 3
 * 연산자
 * 
 * </pre>
 */
public class ChapterOperator
{
	public static void main(String[] args)
	{
//		Example1();
//		Example2();
//		Example3();
//		Example4();
//		Example5();
		Example6();
//		Example7();
//		Example8();
//		Example9();
//		Example10();
	}
	
	
	
	public static void Example1()
	{
		int 	x = 2;
		int 	y = 5;
		char 	c = 'A';	// 'A'의 문자코드는 65
		
		// 시프트 연산
		// ex1) 2 << 1 = 2 * 2^1 = 4
		// ex2) 2 << 3 = 2 * 2^3 = 16
		// int는 32bit이므로 33번 = 1번이 된다.
		System.out.println(1 + x << 33);
		
		// 논리연산자
		// && 가 || 보다 우선순위가 높다.
		System.out.println(y >= 5 || x < 0 && x > 2);
		
		// x++ : 연산이 이루어진 후에 값이 1증가한다.
		System.out.println(y += 10 - x++);
		
		// 위에서 x++ 때문에 x=3이다.
		System.out.println(x += 2);
		
		// 대문자 'A' = 65, 소문자 'a' = 97
		System.out.println( !('A' <= c && c <= 'Z') );
		
		// char타입은 아스키코드로 변환되어 연산한다.
		System.out.println('C' - c);
		
		// '5' - '0' = 53 - 48 = 5
		System.out.println('5' - '0');
		
		// 66
		System.out.println(c + 1);
		
		// 아스키코드 값이 1 증가한 후 char 타입의 값이 출력
		System.out.println(++c);
		
		// char 타입의 값이 출력된 후 아스키코드 값이 1 증가
		System.out.println(c++);
		
		// 'C'
		System.out.println(c);
	}
	
	
	public static void Example2()
	{
		int numOfApples 	= 123;	// 사과의 갯수
		int sizeOfBucket 	= 10;	// 바구니의 크기
		int numOfBucket 	= ((numOfApples % sizeOfBucket) == 0) ? (numOfApples / sizeOfBucket) : (numOfApples / sizeOfBucket) + 1;	// 모든 사과를 담는데 필요한 바구니 수
//		int numOfBucket 	= numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ;	// 답지.
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
	
	
	public static void Example3()
	{
		int num = 10;
		
		System.out.println( (num > 0) ? "양수" : (num < 0) ? "음수" : "0" );
	}
	
	
	public static void Example4()
	{
		int num = 456;
		
		System.out.println( (num / 100) * 100 );
	}
	
	
	public static void Example5()
	{
		int num = 333;
		
		System.out.println( ((num / 10) * 10) + 1 );
	}
	
	
	public static void Example6()
	{
		int num = 24;
		
//		System.out.println( (((num / 10) + 1) * 10) - num );
		System.out.println( 10 - (num % 10) );
	}
	
	
	public static void Example7()
	{
		int 	fahrenheit 	= 100;
//		float 	celcius 	= (float) ((int) (((float) 5/9 * (float) (fahrenheit-32)) * 100)) / 100;
		float 	celcius 	= (float) ((int) (((float) 5/9 * (float) (fahrenheit-32)) * 100 + 0.5)) / 100;
		
		// 반올림을 하기 위해서 0.5를 더해줌.
		
		System.out.println("fahrenheit : " + fahrenheit);
		System.out.println("celcius : " + celcius);
	}
	
	
	public static void Example8()
	{
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		float f = 3/2f;
		long l = 3000 * 3000 * 3000l;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d == f2;
		
		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
	}
	
	
	public static void Example9()
	{
		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		
		System.out.println(b);
	}
	
	
	public static void Example10()
	{
		char ch = 'A';
		char lowerCase = (char) ((65 <= ch && ch <= 90) ? (ch + 32) : ch);
//		char lowerCase = (('A' <= ch && ch <= 'Z') ? (char) (ch + 32) : ch);	// 답지.
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
