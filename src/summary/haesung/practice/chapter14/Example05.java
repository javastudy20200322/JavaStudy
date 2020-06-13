package summary.haesung.practice.chapter14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example05
{

	public static void main(String[] args)
	{
//		문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.
		
		String[] strArr = { "aaa","bb","c", "dddd" };
		
		IntStream 	intStream 	= Stream.of(strArr).mapToInt(x -> x.length());
		int 		sum 		= (int) intStream.summaryStatistics().getSum();
		
		System.out.println("sum : " + sum);
	}

}
