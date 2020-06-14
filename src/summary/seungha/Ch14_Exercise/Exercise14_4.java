package summary.seungha.Ch14_Exercise;

import java.util.stream.Stream;

/* [문제] 문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오. */
public class Exercise14_4 {
	public static void main(String[] args) {
		String[] strArr = {"aaa","bb","c","dddd"};
		Stream<String> strStream = Stream.of(strArr);

//		int sum = strStream.mapToInt(s->s.length()).sum();
		int sum = strStream.mapToInt(String::length).sum();
		System.out.println("sum="+sum);
	}
}
