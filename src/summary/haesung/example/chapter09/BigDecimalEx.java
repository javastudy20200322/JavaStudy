package summary.haesung.example.chapter09;

import java.math.BigDecimal;

public class BigDecimalEx
{

	public static void main(String[] args)
	{
		BigDecimal bd = new BigDecimal("123.456");
		
		System.out.println(bd);					// 123456 * 10^-3
		System.out.println(bd.unscaledValue());	// 123456
		System.out.println(bd.scale());			// 소수점이하 자릿수
		System.out.println(bd.precision());		// 정수전체의 자릿수
	}

}
