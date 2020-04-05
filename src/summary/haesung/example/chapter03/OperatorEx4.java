package summary.haesung.example.chapter03;

public class OperatorEx4
{
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 30;
		
		// byte 타입이 담을 수 없는 값이 되므로 값 손실이 일어난다.
		byte c = (byte) (a * b);
		
		System.out.println(c);
	}
}
