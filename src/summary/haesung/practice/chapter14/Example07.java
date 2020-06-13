package summary.haesung.practice.chapter14;

import java.util.stream.Stream;

public class Example07
{

	public static void main(String[] args)
	{
//		임의의 로또번호(1~45)를 정렬해서 출력하시오.
		
		Stream.generate(Math::random).map(x -> x*45)
			.mapToInt(Double::intValue)
			.distinct()
			.limit(6)
			.sorted()
			.forEach(System.out::println);;
	}

}
