package summary.haesung.example.chapter02;

public class FloatEx1
{
	public static void main(String[] args)
	{
		float 	f 	= 9.12345678901234567890f;
		float 	f2 	= 1.2345678901234567890f;
		double 	d 	= 9.12345678901234567890d;
		
		System.out.printf("      123456789012345678901234%n");
		// %f 는 기본적으로 소수점 이하 7자리에서 반올림하여 출력한다.
		System.out.printf("f	: %f%n", f);
		// %24.20f 는 전체 24자리 중에서 20자리는 소수점 이하의 수를 출력.
		// 소수점 아래 빈 자리들은 0으로 채워진다.
		// 저장공간의 한계로 오차가 발생한 것을 알 수 있다.
		System.out.printf("f	: %24.20f%n", f);
		System.out.printf("f2	: %24.20f%n", f2);
		System.out.printf("d	: %24.20f%n", d);
	}
}
