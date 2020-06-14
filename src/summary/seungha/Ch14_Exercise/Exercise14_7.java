package summary.seungha.Ch14_Exercise;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* [문제] 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오. ([Hint] 배열을 사용하시오.) */
public class Exercise14_7 {
	public static void main(String[] args) {
		Stream<Integer> die = IntStream.rangeClosed(1, 6).boxed();
		
		die.flatMap(i -> Stream.of(1, 2, 3, 4, 5, 6).map(i2 -> new int[] { i, 12 }))
				.filter(iArr -> iArr[0] + iArr[1] == 6)
				.forEach(iArr -> System.out.println(Arrays.toString(iArr)));
	}
}
