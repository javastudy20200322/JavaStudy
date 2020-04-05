package summary.haesung.example.chapter02;

public class CastingEx2
{

	public static void main(String[] args)
	{
		int 	i = 10;
		byte 	b = (byte) i;
		
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		// 300은 byte 타입이 수용할 수 없는 값이므로 값 손실이 일어난다.
		i = 300;
		b = (byte) i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		b = 10;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		b = -2;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		// Integer.toBinaryString(i) 는 10진 정수 i를 2진 정수로 변환한 문자열을 얻을 수 있다.
		System.out.println("i = " + Integer.toBinaryString(i));
	}

}
