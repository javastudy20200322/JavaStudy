package summary.haesung.example.chapter09;

import java.math.BigInteger;

public class BigIntegerEx
{

	public static void main(String[] args)
	{
		// 문자열을 이용해서 숫자를 표현
		// Stirng 처럼 불변이다.
		BigInteger val1 = new BigInteger("12345678901234567890");
		
		// 16진수의 문자열로 숫자를 표현
		BigInteger val2 = new BigInteger("FFFF", 16);
		
		System.out.println(val1);
		System.out.println(val2);
	}

}
