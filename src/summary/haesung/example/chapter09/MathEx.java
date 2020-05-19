package summary.haesung.example.chapter09;

import static java.lang.Math.*;

public class MathEx
{

	public static void main(String[] args)
	{
		System.out.println(round(90.7552));	// 반올림 : 반환값이 int
		System.out.println(ceil(1.1));		// 올림
		System.out.println(floor(1.5));		// 내일
		System.out.println(rint(1.5));		// 가장 가까운 짝수 정수를 반환 : 반환값이 double
		System.out.println(rint(2.5));
		
		System.out.println();
		
		System.out.println(negateExact(10));	// 부호를 반대로 바꾸어준다.
	}

}
