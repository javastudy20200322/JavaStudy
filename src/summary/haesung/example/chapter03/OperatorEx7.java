package summary.haesung.example.chapter03;

public class OperatorEx7
{
	public static void main(String[] args)
	{
		double pi = 3.141592;
		
		// 소수점 셋째자리까지만 나타내며, 그 이하는 버림이된다. 
		double shortPi1 = (int) (pi * 1000) / 1000.0;
		
		// 0.5를 더해주면 반올림하는 것처럼 결과가 나온다.
		double shortPi2 = (int) (pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi1);
		System.out.println(shortPi2);
	}
}
