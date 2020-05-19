package summary.haesung.example.chapter09;

public class WrapperEx
{

	public static void main(String[] args)
	{
		// Integer는 기본형 int의 래퍼클래스
		// 래퍼클래스는 기본형 8개 타입의 값을 객체로 다룰 수 있다.
		Integer i 	= new Integer(100);
		int 	i2 	= 200;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);	// bit 단위
		System.out.println(Integer.BYTES);	// byte 단위
		System.out.println(Integer.TYPE);
		
		System.out.println();
		
		System.out.println(Integer.parseInt("FF", 16)); // 문자열 FF를 16진수로 변환, int타입(기본형)으로 변환
		System.out.println(Integer.valueOf("FF", 16)); 	// 문자열 FF를 16진수로 변환, Integer타입으로 변환
		
		System.out.println();
		
		System.out.println(i + i2);	// 기본형과 참조형 간의 연산도 가능.
	}

}
