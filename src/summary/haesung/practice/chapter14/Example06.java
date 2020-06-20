package summary.haesung.practice.chapter14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example06
{

	public static void main(String[] args)
	{
//		문자열 배열 strArr의 문자열 중에서 가장 긴 것의 길이를 출력하시오.
		
		String[] strArr = { "aaa","bb","c", "dddd" };
		
		IntStream 	intStream = Stream.of(strArr).mapToInt(x -> x.length());
		int 		maxLength = intStream.summaryStatistics().getMax();
		
		System.out.println(maxLength);
		
		
		
		System.out.println(Stream.of(strArr).mapToInt(x -> x.length()).max());
	}

}
