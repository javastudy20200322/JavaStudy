package summary.haesung.practice.chapter14;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example04
{

	public static void main(String[] args)
	{
//		두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
//		[Hint] 배열을 사용하시오.
		
//		[1, 5]
//		[2, 4]
//		[3, 3]
//		[4, 2]
//		[5, 1]
		
		Stream<Integer> die = IntStream.rangeClosed(1,6).boxed();
		
		die.flatMap(i-> Stream.of(1,2,3,4,5,6).map(i2 -> new int[]{ i, i2 }))
			.filter(iArr-> iArr[0]+iArr[1]==6)
			.forEach(iArr -> System.out.println(Arrays.toString(iArr)));
		
	}

}
