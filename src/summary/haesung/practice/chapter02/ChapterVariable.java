package summary.haesung.practice.chapter02;

public class ChapterVariable
{

	public static void main(String[] args)
	{
		Example1();
		Example2();
		Example3();
		Example4();
		Example5();
		Example6();
		Example7();
		Example8();
		Example9();
		Example10();
		Example11();
		Example12();
		Example13();
	}
	
	
	
	
	public static void Example1()
	{
		// 논리형 1byte : boolean
		// 문자형 2byte : char
		// 정수형 1byte : byte
		// 정수형 2byte : short
		// 정수형 4byte : int
		// 정수형 8byte : long
		// 실수형 4byte : float
		// 실수형 8byte : double
	}
	
	public static void Example2()
	{
		// int범위 약 21억을 넘어서니까 long타입으로 초기화
		long regNo = 8810201111111L;
	}
	
	public static void Example3()
	{
		int 		i 	= 100;
		long 		l 	= 100L;
		final float PI 	= 3.14f;
		
		// 리터럴 : 100, 100L, 3.14f
		// 변수 : i, l						-> PI는 변수가 아니다? 새로운 값을 저장할 수 없어서? 상수가 변수에 포함되는 것이 아니다?
		//										: 어. 3개다 맞는 말이다.
		// 키워드 : int, long, final, float
		// 상수 : PI
	}
	
	public static void Example4()
	{
		// Byte는 기본형이 아니다. byte가 기본형이다.
	}
	
	public static void Example5()
	{
		System.out.println("1" + "2");		// 12
		System.out.println(true + "");		// true
		System.out.println('A' + 'B');		// 131
		System.out.println('1' + 2);		// 51
		System.out.println('1' + '2');		// 99
		System.out.println('J' + "ava");	// Java
//		System.out.println(true + null);	// 오류
	}
	
	public static void Example6()
	{
		// if, True, NULL, Class, System
		
		// True, NULL, Class는 키워드가 아니다.
		// System도 키워드가 아니다.
	}
	
	public static void Example7()
	{
		// $ystem, If, 자바, $MAX_NUM 는 변수의 이름으로 사용할 수 있다.
	}
	
	public static void Example8()
	{
		// int와 float이 4byte의 크기를 가지므로 참조형 변수와 같은 크기이다.
	}
	
	public static void Example9()
	{
		byte 	b 	= 10;
		char 	ch 	= 'A';
		int 	i 	= 100;
		long 	l 	= 1000L;
		
		b 	= (byte)i;			// int보다 byte가 크기가 작아서 형변환 생략 불가능
		ch 	= (char)b;			// byte와 char의 범위가 달라서 형변환 생략 불가능
		short s = (short)ch;	// short와 char의 범위가 달라서 형변환 생략 불가능
		float f = (float)l;		// float의 크기가 long보다 작아서 생략 불가능	-> 정답에는 가능하다고 나오는데?
								// : 가능한게 맞다. 실수형과 정수형은 저장 방식이 달라서 float이 long보다 더 많은 수를 저장할 수 있다.
		i 	= (int)ch;			// int의 크기가 char보다 커서 생략 가능
	}
	
	public static void Example10()
	{
		// char 타입은 0~65535까지의 정수를 저장할 수 있다.
	}
	
	public static void Example11()
	{
		// byte b = 256;		byte는 256을 저장하지 못한다.
		// char o = '';			따옴표 안에 공백이라도 한글자 있어야 한다.
		// char answer = 'no';	char타입은 두 글자 이상을 저장하지 못한다.
		// float f = 3.14		실수형의 기본타입이 double이므로 접미사 f를 붙여야하고, ;도 붙여야한다.
	}
	
	public static void Example12()
	{
		// public static void main(String[] args)
	}
	
	public static void Example13()
	{
		// float의 기본값은 0.0f
		// long의 기본값은 0L
		// String의 기본값은 null
	}

}
