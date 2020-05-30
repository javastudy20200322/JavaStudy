package summary.haesung.example.chapter10;

import java.text.DecimalFormat;

public class DecimalFormatEx
{

	public static void main(String[] args)
	{
		// 값이 없으면 0으로 채운다.
		System.out.println(new DecimalFormat("0000000000.0000").format(123456.789));
		
		// 값이 있는 자리만 표현한다.
		System.out.println(new DecimalFormat("##########.####").format(123456.789));
	}

}
