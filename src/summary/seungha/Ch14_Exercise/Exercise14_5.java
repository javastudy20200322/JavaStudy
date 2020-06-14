package summary.seungha.Ch14_Exercise;

import java.util.Comparator;
import java.util.stream.Stream;

/* [문제] 문자열 배열 strArr의 문자열 중에서 가장 긴 것의 길이를 출력하시오. */
public class Exercise14_5 {
	public static void main(String[] args) {
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		Stream<String> strStream = Stream.of(strArr);
		
		strStream.map(String::length)
				.sorted(Comparator.reverseOrder())	//문자열 길이로 역순정렬
				.limit(1).forEach(System.out::println); //제일 긴 문자열의 길이 출력
	}
}
